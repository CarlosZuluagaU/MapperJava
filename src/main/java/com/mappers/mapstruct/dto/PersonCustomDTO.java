package com.mappers.mapstruct.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PersonCustomDTO {

    private Long idDTO;
    private String nameDTO;
    private String emailDTO;
    private String lastNameDTO;
    private int ageDTO;
    private Character genderDTO;

    @Override
    public String toString() {
        return "PersonCustomDTO{" +
                "idDTO=" + idDTO +
                ", nameDTO='" + nameDTO + '\'' +
                ", emailDTO='" + emailDTO + '\'' +
                ", lastNameDTO='" + lastNameDTO + '\'' +
                ", ageDTO=" + ageDTO +
                '}';
    }
}
