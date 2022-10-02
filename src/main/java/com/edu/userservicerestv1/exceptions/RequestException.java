package com.edu.userservicerestv1.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class RequestException extends RuntimeException{

    private String code;

    public RequestException(String message,String code) {
        super(message);
        this.code = code;
    }
}
