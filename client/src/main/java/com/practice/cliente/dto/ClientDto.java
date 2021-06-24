package com.practice.cliente.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    private Long id;
    private String name;
    private String lastName;
    private String idType;
    private String idNumber;
    private Integer age;
    private String cityOfBirth;
    private String picture;
}

