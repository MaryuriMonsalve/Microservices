package com.practice.client.service;


import com.practice.client.dto.ClientDto;

import java.util.List;

public interface IClientService {

    ClientDto save(ClientDto client) throws Exception;
    ClientDto findByIdTypeAndIdNumber(String idType, String idNumber) throws Exception;
    List<ClientDto> findByAgeGreaterThanEqual(Integer age) throws Exception;
    String delete(Long id) throws Exception;

}
