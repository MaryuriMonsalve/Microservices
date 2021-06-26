package com.practice.client.dto;

import com.practice.client.entity.ClientEntity;


public interface IClientMapper {

    ClientEntity toEntity (ClientDto dto);
    ClientDto toDto (ClientEntity entity);
}
