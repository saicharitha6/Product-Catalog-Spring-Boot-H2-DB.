package com.product.exception;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class prodException extends  RuntimeException {
    private static final long serialVersionUID = 1L;
    public prodException(String message){
        super(message);
    }

    public prodException(String message, Throwable throwable ){
        super(message,throwable);
    }
}

