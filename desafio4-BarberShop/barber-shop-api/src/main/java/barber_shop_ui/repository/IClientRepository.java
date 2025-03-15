package barber_shop_ui.repository;

import barber_shop_ui.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IClientRepository  extends JpaRepository<ClientEntity, Long> {

    boolean existsByEmail(final String email);
    boolean existsByPhone(final String phone);

    Optional <ClientEntity> findByEmail(final String email);
    Optional <ClientEntity> findByPhone(final String phone);
}
