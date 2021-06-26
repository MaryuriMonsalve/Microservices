package com.practice.client.dto.mapper;

import java.util.List;

public interface IMapper<E,D>{

   public E toEntity(D dto);
   public List<D> toDtoList(List<E> entity);
   public D toDto(E entity);
}
