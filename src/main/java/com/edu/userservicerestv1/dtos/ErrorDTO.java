package com.edu.userservicerestv1.dtos;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ErrorDTO implements Serializable {

    private String code;

    private String message;

}
