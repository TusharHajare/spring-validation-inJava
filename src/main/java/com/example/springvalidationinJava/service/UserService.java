package com.example.springvalidationinJava.service;

import com.example.springvalidationinJava.entity.User;
import com.example.springvalidationinJava.exception.UserNotFoundException;
import com.example.springvalidationinJava.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public User saveData(User user)
    {
//        User user =User.build(0,userRequest.getUserName(), userRequest.getEmail(),
//                userRequest.getMobilenum(), userRequest.getGender(),
//                userRequest.getAge(), userRequest.getNationality());
        return userRepository.save(user);
    }

    public List<User> getAll()
    {
        return userRepository.findAll();
    }

    public Optional<User> getById(int id) throws UserNotFoundException
    {
        Optional<User> user = userRepository.findById(id);
        if(user!=null)
        {
            return user;
        }
        else {
            throw new UserNotFoundException("user not found with id: " +id);
        }
    }
}
