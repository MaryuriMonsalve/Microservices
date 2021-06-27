package com.practice.client.clientfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="picture", fallback = PictureHystrixFallBackFactory.class)
public interface PictureClient {

        @PostMapping(path = "/picture/save")
        public String procesarFoto(@RequestParam(name = "foto") String fileBase64);


    }
