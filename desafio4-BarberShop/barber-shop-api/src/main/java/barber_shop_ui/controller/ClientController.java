package barber_shop_ui.controller;

import barber_shop_ui.controller.request.SaveClientRequest;
import barber_shop_ui.controller.request.UpdateClientRequest;
import barber_shop_ui.controller.response.ClientDetailResponse;
import barber_shop_ui.controller.response.ListClientResponse;
import barber_shop_ui.controller.response.SaveClientResponse;
import barber_shop_ui.controller.response.UpdateClientResponse;
import barber_shop_ui.entity.ClientEntity;
import barber_shop_ui.mapper.IClientMapper;
import barber_shop_ui.service.IClientService;
import barber_shop_ui.service.impl.ClientService;
import barber_shop_ui.service.query.IClientQueryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("clients")
@AllArgsConstructor
public class ClientController {

    private final IClientService service;
    private final IClientQueryService queryService;
    private final IClientMapper mapper;

    @Autowired
    private ClientService serviceShop;

    @PostMapping("/cadastro")
    public ResponseEntity<?> cadastrarbarber(@RequestBody ClientEntity uiShop) {
        try {
            return serviceShop.registro(uiShop, "cadastro");
        } catch (Exception e) {
            // Log para rastrear possíveis erros
            System.err.println("Erro ao cadastrar cliente: " + e.getMessage());
            return ResponseEntity.badRequest().body("Erro ao cadastrar cliente.");
        }
    }

    @PutMapping("{id}")
    public UpdateClientResponse update(@PathVariable final Long id, @RequestBody @Valid final UpdateClientRequest request) {
        var entity = mapper.toEntity(id, request);
        var updatedEntity = service.update(entity);
        return mapper.toUpdateResponse(updatedEntity);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void delete(@PathVariable final Long id) {
        try {
            service.delete(id);
        } catch (Exception e) {
            // Log para rastrear possíveis erros ao excluir
            System.err.println("Erro ao excluir cliente: " + e.getMessage());
        }
    }

    @GetMapping("{id}")
    public ClientDetailResponse findById(@PathVariable final Long id) {
        try {
            var entity = queryService.findById(id);
            return mapper.toDetailResponse(entity);
        } catch (Exception e) {
            // Log para rastrear possíveis erros ao buscar cliente
            System.err.println("Erro ao buscar cliente por ID: " + e.getMessage());
            throw new RuntimeException("Cliente não encontrado.");
        }
    }

    @GetMapping("/listar")
    public Iterable<ClientEntity> listar() {
        try {
            return serviceShop.listar();
        } catch (Exception e) {
            // Log para rastrear possíveis erros ao listar clientes
            System.err.println("Erro ao listar clientes: " + e.getMessage());
            throw new RuntimeException("Erro ao listar clientes.");
        }
    }
}
