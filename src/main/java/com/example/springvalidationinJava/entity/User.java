package com.example.springvalidationinJava.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "USERS_TABLE")
public class User
{
    @Id
    @GeneratedValue
    private int id;

    //count characters in word
    @NotEmpty(message = "username should not be null")//when type null on that
    @Pattern(regexp = "^\\D{8}$", message = "Invalid username is entered....")//when type empty like " "
    private String userName;

    @Email
    private String email;

    @Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number is entered")
    private String mobilenum;
    @NotBlank(message = "Please enter correct gender")
    private String gender;
    @Min(18)
    @Max(50)
    private int age;
    @NotEmpty(message = "Nationality should not be empty..")
    private String nationality;

}
