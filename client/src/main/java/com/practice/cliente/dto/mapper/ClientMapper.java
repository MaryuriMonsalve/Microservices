package com.practice.cliente.dto.mapper;

import com.practice.cliente.dto.ClientDto;
import com.practice.cliente.entity.ClientEntity;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper implements EntityDtoMapper<ClientEntity, ClientDto>{

    @Override
    public ClientEntity toEntity(ClientDto dto) {

        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setId(dto.getId());
        clientEntity.setNombre(dto.getNombre());
        clientEntity.setApellido(dto.getApellido());
        clientEntity.setTipoIdentificacion(dto.getTipoIdentificacion());
        clientEntity.setNumeroIdentificacion(dto.getNumeroIdentificacion());
        clientEntity.setEdad(dto.getEdad());
        clientEntity.setCiudadNacimiento(dto.getCiudadNacimiento());
        return clientEntity;
    }

    @Override
    public ClientDto toDto(ClientEntity entity) {
        return null;
    }
}
