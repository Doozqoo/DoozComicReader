package com.dooz.domain;

import com.dooz.enums.HttpStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Ayachi Nene
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseResult implements Serializable {

    private Integer value;
    private String reasonPhrase;
    private Object data;

    public ResponseResult(Integer value, String reasonPhrase, Object data) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
        this.data = data;
    }

    public static ResponseResult builder(HttpStatus httpStatus, Object data){
        return new ResponseResult(httpStatus.value(), httpStatus.reasonPhrase(), data);
    }
}
