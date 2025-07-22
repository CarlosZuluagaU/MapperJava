package com.mappers.orikamapper;

import com.mappers.Mappers.dto.PersonCustomDTO;
import com.mappers.orikamapper.dto.PersonDefaultDTO;
import com.mappers.orikamapper.entities.Person;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;


//Esto es para iguales
public class Main {
//        public static void main(String[] args) {
//            MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
//            mapperFactory.classMap(Person.class, PersonDefaultDTO.class);
//
//
//            MapperFacade mapperFacade= mapperFactory.getMapperFacade();
//
//            com.mappers.Mappers.entities.Person person = new com.mappers.Mappers.entities.Person(1L, "John", "johonPerez@gmail.com",30,"Perez", 'M');
//            System.out.println(person);
//
//            PersonDefaultDTO personDefaultDTO=mapperFacade.map(person,PersonDefaultDTO.class);
//            System.out.println(personDefaultDTO);
//        }

    public static void main(String[] args) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(Person.class, PersonCustomDTO.class)
                .field("id", "idDTO")
                .field("name", "nameDTO")
                .field("email", "emailDTO")
                .field("lastName", "lastNameDTO")
                .field("age", "ageDTO")
                .field("gender", "genderDTO")
                .byDefault()
                .register();

        MapperFacade mapperFacade = mapperFactory.getMapperFacade();

        Person person = new Person(1L, "John", "johonPerez@gmail.com",30,"Perez", 'M');
         System.out.println(person);
        PersonCustomDTO personCustomDTO= mapperFacade.map(person, PersonCustomDTO.class);
        System.out.println(personCustomDTO);

    }
}
