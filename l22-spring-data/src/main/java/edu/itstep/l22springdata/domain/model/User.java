package edu.itstep.l22springdata.domain.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import java.sql.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    private String email;

    @Column(columnDefinition = "TEXT NOT NULL")
    private String description;


    //    @Transient
    //    int age;
    @CreatedDate
    @Column(name = "created_at")
    private Date createdAt;
    @LastModifiedBy
    @Column(name = "updated_at")
    private Date updatedAt;

}
