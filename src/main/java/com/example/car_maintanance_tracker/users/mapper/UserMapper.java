package com.example.car_maintanance_tracker.users.mapper;

import com.example.car_maintanance_tracker.users.UserDTO;
import com.example.car_maintanance_tracker.users.repository.entity.UserEntity;
import com.example.model.UserRegistrationRequestDTO;
import lombok.Setter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
@Component
public abstract class UserMapper {

    @Setter(onMethod_ = {@Autowired})
    private PasswordEncoder passwordEncoder;

    @Mapping(source = "password", target = "password", qualifiedByName = "hashPassword")
    public abstract UserEntity toUserEntity(UserRegistrationRequestDTO requestDTO);

    @Named("hashPassword")
    public String hashPassword(String sourcePassword) {
        return passwordEncoder.encode(sourcePassword);
    }

    public abstract UserDTO toUserDTO(UserEntity entity) ;
}
