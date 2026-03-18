package com.example.car_maintanance_tracker.users.api;

import com.example.api.UsersControllerApi;
import com.example.car_maintanance_tracker.users.UserDTO;
import com.example.car_maintanance_tracker.users.UserService;
import com.example.car_maintanance_tracker.users.api.mapper.UserApiMapper;
import com.example.model.UserRegistrationRequestDTO;
import com.example.model.UserResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController implements UsersControllerApi {

    private final UserService userService;

    private final UserApiMapper mapper;

    @Override
    public UserResponseDTO create(UserRegistrationRequestDTO userRegistrationRequestDTO) {
        UserDTO createUser =  userService.create(userRegistrationRequestDTO);
        return mapper.toUserResponseDTO(createUser);
    }
}
