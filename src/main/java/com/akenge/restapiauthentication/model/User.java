package com.akenge.restapiauthentication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Indexed;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;

}
