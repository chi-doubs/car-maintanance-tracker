package com.example.car_maintanance_tracker.users;


import com.example.car_maintanance_tracker.users.mapper.UserMapper;
import com.example.car_maintanance_tracker.users.repository.UserRepository;
import com.example.car_maintanance_tracker.users.repository.entity.UserEntity;
import com.example.model.UserRegistrationRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper mapper;

    @Transactional
    public UserDTO create(UserRegistrationRequestDTO requestDTO) {
        UserEntity entity = userRepository.save(mapper.toUserEntity(requestDTO));
        return mapper.toUserDTO(entity);
    }
}
