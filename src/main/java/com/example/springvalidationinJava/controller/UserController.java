package com.example.springvalidationinJava.controller;

import com.example.springvalidationinJava.entity.User;
import com.example.springvalidationinJava.exception.UserNotFoundException;
import com.example.springvalidationinJava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restapi")
public class UserController
{

    @Autowired
    private UserService services;
//    private UserImpl userimpl;

    @PostMapping("/save")
    public ResponseEntity<User> saveUserData(@RequestBody @Valid User user)
    {
        return new ResponseEntity<>(services.saveData(user), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getaData()
    {
        return ResponseEntity.ok(services.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getaDataById(@PathVariable int id) throws UserNotFoundException
    {
        return ResponseEntity.ok(services.getById(id));
    }
}
