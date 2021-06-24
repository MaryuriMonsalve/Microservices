package com.practice.client.configuration.exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
    }
    public NotFoundException(String message){
        super(message);
    }
}
