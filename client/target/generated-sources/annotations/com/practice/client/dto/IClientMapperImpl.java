package com.practice.client.dto;

import com.practice.client.entity.ClientEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-24T17:50:43-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Amazon.com Inc.)"
)
public class IClientMapperImpl implements IClientMapper {

    @Override
    public ClientEntity toEntity(ClientDto dto) {
        if ( dto == null ) {
            return null;
        }

        ClientEntity clientEntity = new ClientEntity();

        clientEntity.setId( dto.getId() );
        clientEntity.setName( dto.getName() );
        clientEntity.setLastName( dto.getLastName() );
        clientEntity.setIdType( dto.getIdType() );
        clientEntity.setIdNumber( dto.getIdNumber() );
        clientEntity.setAge( dto.getAge() );
        clientEntity.setCityOfBirth( dto.getCityOfBirth() );

        return clientEntity;
    }

    @Override
    public ClientDto toDto(ClientEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ClientDto clientDto = new ClientDto();

        clientDto.setId( entity.getId() );
        clientDto.setName( entity.getName() );
        clientDto.setLastName( entity.getLastName() );
        clientDto.setIdType( entity.getIdType() );
        clientDto.setIdNumber( entity.getIdNumber() );
        clientDto.setAge( entity.getAge() );
        clientDto.setCityOfBirth( entity.getCityOfBirth() );

        return clientDto;
    }
}
