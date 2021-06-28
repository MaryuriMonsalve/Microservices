package com.practice.client.controller;


import com.practice.client.dto.ClientDto;
import com.practice.client.service.IClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/client")
public class ClientRest {


    private IClientService clientService;

    public ClientRest(IClientService clientService){
        this.clientService = clientService;
    }

    @PostMapping("/save")
    public ClientDto save(@RequestBody ClientDto cliente)throws Exception{
        return clientService.save(cliente);
    }

    @GetMapping("/findAll")
    public List<ClientDto> findAll() throws Exception {
        return clientService.findAll();
    }

}
