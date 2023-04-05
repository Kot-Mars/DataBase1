package com.DataBase.DataBase;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "person_name")
    private String name;

    public Person() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
