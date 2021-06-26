package com.practice.client.dto.mapper.impl;


import com.practice.client.dto.ClientDto;
import com.practice.client.dto.mapper.IMapper;
import com.practice.client.entity.ClientEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MapperImpl implements IMapper<ClientEntity, ClientDto> {

    @Override
    public ClientEntity toEntity(ClientDto dto) {

        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setId(dto.getId());
        clientEntity.setName(dto.getName());
        clientEntity.setLastName(dto.getLastName());
        clientEntity.setIdType(dto.getIdType());
        clientEntity.setIdNumber(dto.getIdNumber());
        clientEntity.setAge(dto.getAge());
        clientEntity.setCityOfBirth(dto.getCityOfBirth());
        return clientEntity;
    }

    @Override
    public List<ClientDto> toDtoList(List<ClientEntity> entity) {
        List <ClientDto> clients= new ArrayList<>();
        for(ClientEntity c: entity){
            clients.add(toDto(c));
        }

        return clients;
    }

    @Override
    public ClientDto toDto(ClientEntity entity) {

        ClientDto clientDto= new ClientDto();
        clientDto.setId(entity.getId());
        clientDto.setName(entity.getName());
        clientDto.setLastName(entity.getLastName());
        clientDto.setIdType(entity.getIdType());
        clientDto.setIdNumber(entity.getIdNumber());
        clientDto.setAge(entity.getAge());
        clientDto.setCityOfBirth(entity.getCityOfBirth());
        return clientDto;

    }
}
