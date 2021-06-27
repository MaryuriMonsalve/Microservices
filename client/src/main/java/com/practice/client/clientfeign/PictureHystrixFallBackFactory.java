package com.practice.client.clientfeign;

import org.springframework.stereotype.Component;

@Component
public class PictureHystrixFallBackFactory implements PictureClient{
    @Override
    public String procesarFoto(String fileBase64) {
        return "---";
    }
}
