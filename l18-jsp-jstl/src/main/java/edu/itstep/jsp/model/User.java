package edu.itstep.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;

    public String getFormatted() {
        return id + " " + name;
    }
}
