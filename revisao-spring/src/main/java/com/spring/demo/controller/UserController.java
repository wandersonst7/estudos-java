package com.spring.demo.controller;

import com.spring.demo.dto.ApiErrorResponse;
import com.spring.demo.dto.UserPayload;
import com.spring.demo.model.User;
import com.spring.demo.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path="/usuarios")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<Object> addNewUser (@RequestBody UserPayload userPayload) {
        try{
            if(userRepository.existsUserByEmail(userPayload.email())){
                return ResponseEntity
                        .status(422)
                        .body(new ApiErrorResponse("Já existe um usuário com este e-mail."));
            }

            User user = new User();
            user.setName(userPayload.name());
            user.setEmail(userPayload.email());
            userRepository.save(user);

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(user);
        }catch (Exception e){
            e.printStackTrace(); // debug

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new ApiErrorResponse(e.getMessage()));
        }
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        // This returns a JSON or XML with the users
        return ResponseEntity.status(HttpStatus.OK).body(userRepository.findAll());
    }
}
