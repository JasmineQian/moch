package com.moretickets.platform.servet;

import com.moretickets.platform.common.message;
import com.fasterxml.jackson.annotation.JsonIgnore;


public class ResponseBean<T> {

    @JsonIgnore
    private boolean ok(){return this.code.equalsIgnoreCase(message.SUCCESS_CODE);}

    public ResponseBean(){
        this.code=message.SUCCESS_CODE;
        this.msg=message.SUCCESS_MESSAGE;
    }


    public ResponseBean(T data){
        this.code=message.SUCCESS_CODE;
        this.msg=message.SUCCESS_MESSAGE;
        this.data=data;
    }

    private String msg;
    private String code;
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
