package com.moretickets.platform.common;

import com.moretickets.platform.servet.ResponseBean;

public class commoResponse {

    public static ResponseBean checkCountResponse(int count){
    ResponseBean responseBean = new ResponseBean();

    if(count>0){
        return responseBean;
    }else {
        responseBean.setCode(message.ERROR_CODE_001);
        responseBean.setMsg(message.ERROR_MESSAGE_001);
        return responseBean;
    }
}
}
