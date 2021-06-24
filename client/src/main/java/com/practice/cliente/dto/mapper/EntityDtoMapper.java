package com.practice.cliente.dto.mapper;

public interface EntityDtoMapper <E,D>{

    E toEntity(D dto);
    D toDto(E entity);
}
