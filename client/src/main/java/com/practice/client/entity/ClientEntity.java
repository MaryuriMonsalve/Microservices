package com.practice.client.entity;


import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Cliente")
public class ClientEntity {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(generator="id", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "id", sequenceName = "id",allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "id_type")
    private String idType;

    @Column(name = "id_number", unique = true)
    private String idNumber;

    @Column(name = "age")
    private Integer age;

    @Column(name = "city_of_birth")
    private String cityOfBirth;

    @Column(name = "id_Picture")
    private String idPicture;
}
