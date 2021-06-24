package com.practice.cliente.controller;

import com.practice.cliente.dto.ClientDto;
import com.practice.cliente.service.IClientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Cliente")
public class ClientRest {


    private IClientService IClientService;

    public ClientRest(IClientService IClientService){
        this.IClientService = IClientService;
    }

    @PostMapping("/save")
    public ClientDto save(@RequestBody ClientDto cliente){
        return IClientService.save(cliente);
    }

}
