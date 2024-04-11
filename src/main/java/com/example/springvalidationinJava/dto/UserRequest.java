package com.example.springvalidationinJava.dto;

import lombok.*;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor  /*(staticName = "build") */
@NoArgsConstructor
public class UserRequest
{
    private String userName;
    private String email;
    private String mobilenum;
    private String gender;
    private int age;
    private String nationality;
}
