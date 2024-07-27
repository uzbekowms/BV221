package edu.itstep.lombok.model;

import lombok.*;


@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {
    private final String name;
    private int age;
    private float height;
    private float weight;
}
