package com.practice.client.repository;

import com.practice.client.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientRepository extends CrudRepository<ClientEntity,Long> {

    ClientEntity findByIdTypeAndIdNumber(String type, String number);
    List<ClientEntity> findByAgeGreaterThanEqual(Integer age);
    ClientEntity findByIdNumber(String number);

}
