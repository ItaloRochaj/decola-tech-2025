package barber_shop_ui.service;

import barber_shop_ui.entity.ClientEntity;
import org.springframework.http.ResponseEntity;

public interface IClientService {

    // Método da interface
    ResponseEntity<?> registro(ClientEntity clienteCadastro, String barberError);

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

    Iterable<ClientEntity> listar();
}
