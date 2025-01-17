package com.example.springvalidationinJava.repository;

import com.example.springvalidationinJava.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{

}
