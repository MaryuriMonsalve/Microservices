package com.practice.client.controller;

import com.practice.client.dto.ClientDto;
import com.practice.client.service.IClientService;
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
    public ClientDto save(@RequestBody ClientDto cliente)throws Exception{
        return IClientService.save(cliente);
    }

}
