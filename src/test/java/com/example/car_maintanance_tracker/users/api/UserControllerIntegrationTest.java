package com.example.car_maintanance_tracker.users.api;

import com.example.api.UsersControllerApi;
import com.example.car_maintanance_tracker.users.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jdbc.test.autoconfigure.AutoConfigureDataJdbc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static com.example.api.UsersControllerApi.PATH_CREATE;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureDataJdbc
class UserControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

//    @Test
//    void shouldRegisterUser()  throws Exception {
//        mockMvc.perform(post(PATH_CREATE)
//        .contentType(MediaType.APPLICATION_JSON))
//    }

}