package barber_shop_ui.service.impl;

import barber_shop_ui.entity.ClientEntity;
import barber_shop_ui.repository.IClientRepository;
import barber_shop_ui.service.IClientService;
import barber_shop_ui.service.query.IClientQueryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {

    private final IClientRepository clientRepository;
    private final IClientQueryService clientQueryService;

    @Override
    public ResponseEntity<?> registro(ClientEntity clienteCadastro, String barberError) {
        // Lógica de validação já existente
        if (clienteCadastro.getName() == null || clienteCadastro.getName().isEmpty()) {
            return ResponseEntity.badRequest().body("O nome precisa ser preenchido");
        }

        if (clienteCadastro.getEmail() == null || clienteCadastro.getEmail().isEmpty()) {
            return ResponseEntity.badRequest().body("O email precisa ser preenchido");
        }

        if (clienteCadastro.getPhone() == null || clienteCadastro.getPhone().isEmpty()) {
            return ResponseEntity.badRequest().body("O telefone precisa ser preenchido");
        }

        // Salvar cliente
        HttpStatus status = barberError.equals("/cadastro") ? HttpStatus.CREATED : HttpStatus.OK;
        return new ResponseEntity<>(clientRepository.save(clienteCadastro), status);
    }

    @Override
    public ClientEntity save(ClientEntity entity) {
        return null;
    }

    @Override
    public ClientEntity update(ClientEntity entity) {
        // Verificar se o cliente existe
        ClientEntity existingClient = clientQueryService.findById(entity.getId());

        // Verificar duplicidade de e-mail e telefone
        clientQueryService.verifyEmail(entity.getId(), entity.getEmail());
        clientQueryService.verifyPhone(entity.getId(), entity.getPhone());

        // Atualizar os dados
        existingClient.setName(entity.getName());
        existingClient.setEmail(entity.getEmail());
        existingClient.setPhone(entity.getPhone());

        // Salvar as alterações
        return clientRepository.save(existingClient);
    }

    @Override
    public void delete(long id) {
        // Verificar se o cliente existe antes de excluir
        clientQueryService.findById(id);
        clientRepository.deleteById(id);
    }

    @Override
    public Iterable<ClientEntity> listar() {
        return clientRepository.findAll();
    }
}
