package com.example.car_maintanance_tracker.users.validation;

import com.example.model.UserRegistrationRequestDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;


@Component
public class EqualPasswordsValidator implements ConstraintValidator<EqualPasswords, UserRegistrationRequestDTO> {

    @Override
    public boolean isValid(UserRegistrationRequestDTO requestDTO, ConstraintValidatorContext constraintValidatorContext) {
        if (requestDTO == null) {
            return true;
        }
        if (requestDTO.getPassword() == null || requestDTO.getPasswordRepeat() == null ) {
            return true;
        }
        return requestDTO.getPassword().equals(requestDTO.getPasswordRepeat());
    }

}
