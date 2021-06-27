package com.practice.client.service.Impl;

import com.practice.client.clientfeign.PictureClient;
import com.practice.client.dto.ClientDto;
import com.practice.client.dto.mapper.impl.MapperImpl;
import com.practice.client.entity.ClientEntity;
import com.practice.client.repository.ClientRepository;
import com.practice.client.service.IClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    public ClientRepository clientRepository;
    public MapperImpl clientMapper;
    public PictureClient pictureClient;


    public ClientServiceImpl(ClientRepository clientRepository, MapperImpl clientMapper, PictureClient pictureClient){
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
        this.pictureClient = pictureClient;
    }

    @Override
    public ClientDto save(ClientDto cliente) {
        ClientEntity clientEntity = clientMapper.toEntity(cliente);
        pictureClient.procesarFoto(cliente.getPicture());
        clientRepository.save(clientEntity);
        return cliente;    }

    @Override
    public List<ClientDto> findAll() throws Exception {
        List<ClientEntity> listaEntity= (List<ClientEntity>) clientRepository.findAll();
        List<ClientDto> list= clientMapper.toDtoList(listaEntity);
        return list;
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
