package edu.itstep.l21springweb.domain.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {
    private int id;
    private String name;
}
