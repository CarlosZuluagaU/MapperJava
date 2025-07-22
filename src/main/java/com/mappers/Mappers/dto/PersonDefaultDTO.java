package com.mappers.Mappers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDefaultDTO {
    private Long id;
    private String name;
    private String email;
    private String lastName;
    private int age;
    private Character gender;

    @Override
    public String toString() {
        return "PersonDefaultDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}

