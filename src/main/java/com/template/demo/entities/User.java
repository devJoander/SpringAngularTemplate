package com.template.demo.entities;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    private Long id;

    private String name;

    private String lastname;

    private String status;

    private String email;

    private String password;

    private Long age;

    private LocalDateTime birthDate;

    private LocalDateTime dateCreation;
    
    private LocalDateTime dateUpdate;
}
