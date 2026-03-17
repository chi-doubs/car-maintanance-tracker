package com.example.car_maintanance_tracker.users.api;

import com.example.api.UsersControllerApi;
import com.example.car_maintanance_tracker.users.UserDTO;
import com.example.car_maintanance_tracker.users.UserService;
import com.example.model.UserRegistrationRequestDTO;
import com.example.model.UserResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController implements UsersControllerApi {

    private  UserService userService;

    @Override
    public UserResponseDTO create(UserRegistrationRequestDTO userRegistrationRequestDTO) {
        UserDTO create =userService.create(userRegistrationRequestDTO);
        return null;
    }
}
