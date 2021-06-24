package com.practice.client.dto;

import com.practice.client.entity.ClientEntity;
import org.mapstruct.Mapper;

@Mapper
public interface IClientMapper {

    ClientEntity toEntity (ClientDto dto);
    ClientDto toDto (ClientEntity entity);
}
