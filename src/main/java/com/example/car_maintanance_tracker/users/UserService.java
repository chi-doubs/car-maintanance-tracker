package com.example.car_maintanance_tracker.users;


import com.example.car_maintanance_tracker.users.repository.UserRepository;
import com.example.model.UserRegistrationRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {


    private final PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;

    public UserDTO create(UserRegistrationRequestDTO userRegistrationRequestDTO) {
        return null;
    }
}
