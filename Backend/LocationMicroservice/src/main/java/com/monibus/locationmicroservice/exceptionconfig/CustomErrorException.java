package com.monibus.locationmicroservice.exceptionconfig;

public class CustomErrorException extends  RuntimeException{
    public CustomErrorException(String message){
        super(message);
    }
}
