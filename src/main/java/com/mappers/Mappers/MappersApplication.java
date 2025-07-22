package com.mappers.Mappers;

import com.mappers.Mappers.dto.PersonCustomDTO;
import com.mappers.Mappers.dto.PersonDefaultDTO;
import com.mappers.Mappers.entities.Person;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappersApplication {

	//MAppeo con nombres iguales


	//Este fue el model mapper por Defalt

//	public static void main(String[] args) {
//		ModelMapper modelMapper = new ModelMapper();
//		//Este es el mapeo por defecto, donde los nombres de las propiedades son iguales
//		//Mappeo
//
//		Person person = new Person(1L, "John", "johonPerez@gmail.com",30,"Perez", 'M');
//		System.out.println(person);
//
//		PersonDefaultDTO personDefaultDTO = modelMapper.map (person, PersonDefaultDTO.class);
//		System.out.println(personDefaultDTO);
//		//Estamos usando el PersonDefaultDTO que tiene los mismos nombres de propiedades que Person
//		//Por eso mismo funciona el mapeo por defecto
//		//Las dos clases tienen los mismos nombres de propiedades, por lo que el mapeo es automático
//		//Ahora vamos a ver como seria si fueran distintos
//
//	}


	//Model Mapper Custom
	public static void main(String[] args) {
		ModelMapper modelMapper = new ModelMapper();

		TypeMap<Person, PersonCustomDTO> propertyMapper = modelMapper.createTypeMap(Person.class, PersonCustomDTO.class);
		propertyMapper.addMapping(Person::getId , PersonCustomDTO::setIdDTO);
		propertyMapper.addMapping(Person::getName , PersonCustomDTO::setNameDTO);
		propertyMapper.addMapping(Person::getEmail , PersonCustomDTO::setEmailDTO);
		propertyMapper.addMapping(Person::getLastName , PersonCustomDTO::setLastNameDTO);
		propertyMapper.addMapping(Person::getAge , PersonCustomDTO::setAgeDTO);
		propertyMapper.addMapping(Person::getGender , PersonCustomDTO::setGenderDTO);
		//Este es el mapeo personalizado, donde los nombres de las propiedades son distintos

		Person person = new Person(1L, "John", "johonPerez@gmail.com",30,"Perez", 'M');
		System.out.println(person);

		PersonCustomDTO personCustomDTO = modelMapper.map(person, PersonCustomDTO.class);
		System.out.println(personCustomDTO);
	}
}
