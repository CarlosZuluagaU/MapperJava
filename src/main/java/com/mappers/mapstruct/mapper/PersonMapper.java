package com.mappers.mapstruct.mapper;

import com.mappers.mapstruct.dto.PersonCustomDTO;
import com.mappers.mapstruct.dto.PersonDefaultDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
//Este esta mejor
public interface PersonMapper {

    PersonMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(PersonMapper.class);
    //Este es el que se usa para mapear los objetos

    //Ahora debo poner que es lo que que quiero mappear
    PersonDefaultDTO personToPersonDefaultDTO(com.mappers.mapstruct.entities.Person person);

    @Mapping(source = "id", target = "idDTO")
    @Mapping(source = "name", target = "nameDTO")
    @Mapping(source = "email", target = "emailDTO")
    @Mapping(source = "lastName", target = "lastNameDTO")
    @Mapping(source = "age", target = "ageDTO")
    @Mapping(source = "gender", target = "genderDTO")
    PersonCustomDTO personToPersonCustomDTO(com.mappers.mapstruct.entities.Person person);


}

