package barber_shop_ui.service.impl;

import barber_shop_ui.entity.ClientEntity;
import barber_shop_ui.exception.NotFoundException;
import barber_shop_ui.exception.PhoneInUseException;
import barber_shop_ui.repository.IClientRepository;
import barber_shop_ui.service.query.IClientQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class ClientQueryService implements IClientQueryService {

    private final IClientRepository repository;

    @Override
    public ClientEntity findById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Não foi encontrado o cliente com id " + id));
    }

    @Override
    public List<ClientEntity> list() {
        return repository.findAll();
    }

    @Override
    public void verifyPhone(String phone) {
        if (repository.existsByPhone(phone)) {
            var message = "O telefone " + phone + " já está em uso.";
            throw new PhoneInUseException(message);
        }
    }

    @Override
    public void verifyPhone(final long id, final String phone) {
        var optional = repository.findByPhone(phone);
        if (optional.isPresent() && !Objects.equals(optional.get().getId(), id)) {
            var message = "O telefone " + phone + " já está em uso.";
            throw new PhoneInUseException(message);
        }
    }

    @Override
    public void verifyEmail(final String email) {
        if (repository.existsByEmail(email)) {
            var message = "O e-mail " + email + " já está em uso.";
            throw new PhoneInUseException(message);
        }
    }

    @Override
    public void verifyEmail(final long id, final String email) {
        var optional = repository.findByEmail(email);
        if (optional.isPresent() && !Objects.equals(optional.get().getId(), id)) {
            var message = "O e-mail " + email + " já está em uso.";
            throw new PhoneInUseException(message);
        }
    }
}
