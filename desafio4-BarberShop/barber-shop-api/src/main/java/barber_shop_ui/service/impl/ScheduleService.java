package barber_shop_ui.service.impl;

import barber_shop_ui.entity.ClientEntity;
import barber_shop_ui.entity.ScheduleEntity;
import barber_shop_ui.repository.IScheduleRepository;
import barber_shop_ui.service.IClientService;
import barber_shop_ui.service.IScheduleService;
import barber_shop_ui.service.query.IScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;

    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());
        return repository.save(entity);
    }

    @Override
    public void delete(final long id) {
        queryService.findById(id);
        repository.deleteById(id);

    }
}
