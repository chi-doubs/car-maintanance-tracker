package com.example.car_maintanance_tracker.users.api;

import com.example.api .UsersControllerApi;
import com.example.car_maintanance_tracker.users.repository.UserRepository;
import net.javacrumbs.jsonunit.spring.JsonUnitResultMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jdbc.test.autoconfigure.AutoConfigureDataJdbc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static com.example.api.UsersControllerApi.PATH_CREATE;
import static net.javacrumbs.jsonunit.spring.JsonUnitResultMatchers.json;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureDataJdbc
@AutoConfigureMockMvc
class UserControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldRegisterNewUser() throws Exception {
             String requestBody = """
        {
            "email": "test@example.com",
            "password": "SomePassword123",
            "passwordRepeat": "SomePassword123"
        }
        """;

             String expectedResponse = """
                            {
                            "id": "${json-unit.any-number}",
                            "email": "test@example.com"
                            }
                            """;

             mockMvc.perform(post(PATH_CREATE)
                             .contentType(MediaType.APPLICATION_JSON)
                             .contentType("application/json")
                             .content(requestBody))
                     .andExpect(status().isCreated())
                     .andExpect(json().isEqualTo(expectedResponse));

        }


        @Test
        void shouldNotRegisterUserBecausePasswordsAreNotEqual() throws Exception {
            String requestBody = """
        {
            "email": "test@example.com",
            "password": "SomePassword123",
            "passwordRepeat": "AnotherPassword123"
        }
        """;

//            String expectedResponse = """
//                            {
//                            "id": "${json-unit.any-number}",
//                            "email": "test@example.com"
//                            }
//                            """;

            mockMvc.perform(post(PATH_CREATE)
                            .contentType(MediaType.APPLICATION_JSON)
                            .contentType("application/json")
                            .content(requestBody))
                    .andExpect(status().isBadRequest());
                   // .andExpect(json().isEqualTo(expectedResponse));

        }

    }