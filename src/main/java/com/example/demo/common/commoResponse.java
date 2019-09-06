package com.example.demo.common;

import com.example.demo.servet.ResponseBean;

import static com.example.demo.common.message.ERROR_CODE_001;
import static com.example.demo.common.message.ERROR_MESSAGE_001;

public class commoResponse {

    public static ResponseBean checkCountResponse(int count){
    ResponseBean responseBean = new ResponseBean();

    if(count>0){
        return responseBean;
    }else {
        responseBean.setCode(ERROR_CODE_001);
        responseBean.setMsg(ERROR_MESSAGE_001);
        return responseBean;
    }
}
}
