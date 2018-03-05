package com.liang.controller.pexception;

public class UserException extends RuntimeException {
    public UserException(){

    }
    public UserException(String msg){
        super(msg);
    }
}
