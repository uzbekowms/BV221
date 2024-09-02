package edu.itstep.l22spring.domain.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private int id;
    private String name;
    private String lastName;
    private String email;
    private String password;
}
