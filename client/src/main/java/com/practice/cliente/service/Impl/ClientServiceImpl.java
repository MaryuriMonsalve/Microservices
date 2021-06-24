package com.practice.cliente.service.Impl;

import com.practice.cliente.dto.ClientDto;
import com.practice.cliente.dto.mapper.ClientMapper;
import com.practice.cliente.entity.ClientEntity;
import com.practice.cliente.repository.ClientRepository;
import com.practice.cliente.service.IClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    public ClientRepository clientRepository;
    public ClientMapper clientMapper;


    public ClientServiceImpl(ClientRepository clientRepository, ClientMapper clientMapper){
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;

    }

    @Override
    public ClientDto save(ClientDto cliente) {
        ClientEntity clientEntity = clientMapper.toEntity(cliente);
        clientRepository.save(clientEntity);
        return cliente;
    }

    @Override
    public ClientDto findByIdTypeAndIdNumber(String idType, String idNumber) throws Exception {
        return null;
    }

    @Override
    public List<ClientDto> findByAgeGreaterThanEqual(Integer age) throws Exception {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }

}
