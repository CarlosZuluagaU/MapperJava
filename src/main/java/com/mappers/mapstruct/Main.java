package com.mappers.mapstruct;

import com.mappers.mapstruct.dto.PersonCustomDTO;
import com.mappers.mapstruct.dto.PersonDefaultDTO;
import com.mappers.mapstruct.mapper.PersonMapper;
import com.mappers.mapstruct.entities.Person;

public class Main {
    //Map Struct default

    //Nosotros normalmente debems mappear los objetos
    //este usa mas interfaces y anotaciones
//    public static void main(String[] args) {
//        Person person = new Person(1L, "John", "johonPerez@gmail.com", 30, "Perez", 'M');
//        System.out.println(person);
//
//        PersonDefaultDTO dto = PersonMapper.INSTANCE.personToPersonDefaultDTO(person);
//        System.out.println(dto);
//
//    }

    public static void main(String[] args) {
        Person person = new Person(1L, "John", "johonPerez@gmail.com", 30, "Perez", 'M');
            System.out.println(person);

        PersonCustomDTO dto1= PersonMapper.INSTANCE.personToPersonCustomDTO(person);
        System.out.println(dto1);
    }
}
