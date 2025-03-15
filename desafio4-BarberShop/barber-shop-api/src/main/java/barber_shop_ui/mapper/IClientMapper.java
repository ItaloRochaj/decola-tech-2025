package barber_shop_ui.mapper;


import barber_shop_ui.controller.request.SaveClientRequest;
import barber_shop_ui.controller.request.UpdateClientRequest;
import barber_shop_ui.controller.response.ClientDetailResponse;
import barber_shop_ui.controller.response.ListClientResponse;
import barber_shop_ui.controller.response.SaveClientResponse;
import barber_shop_ui.controller.response.UpdateClientResponse;
import barber_shop_ui.entity.ClientEntity;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.swing.*;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.springframework.http.HttpStatus.CREATED;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);

}
