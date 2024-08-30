package edu.itstep.l20springboot.domain.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String id = UUID.randomUUID().toString();
    private String name;
}
