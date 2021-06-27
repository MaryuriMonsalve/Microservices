package com.practice.client.clientfeign;

public class PictureHystrixFallBackFactory implements PictureClient{
    @Override
    public String procesarFoto(String fileBase64) {
        return "---";
    }
}
