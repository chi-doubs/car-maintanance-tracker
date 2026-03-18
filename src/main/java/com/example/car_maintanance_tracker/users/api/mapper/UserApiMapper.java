package com.example.car_maintanance_tracker.users.api.mapper;

import com.example.car_maintanance_tracker.users.UserDTO;
import com.example.model.UserResponseDTO;
import org.mapstruct.Mapper;


import static org.mapstruct.ap.internal.gem.MappingConstantsGem.ComponentModelGem.SPRING;


@Mapper(componentModel = SPRING)
public interface UserApiMapper {
    UserResponseDTO toUserResponseDTO(UserDTO createUser);
}
