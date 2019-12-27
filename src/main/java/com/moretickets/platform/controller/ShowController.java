package com.moretickets.platform.controller;


import com.moretickets.platform.bean.ApiCaseBean;
import com.moretickets.platform.servet.ResponseBean;
import com.moretickets.platform.service.ApiCaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="show")
@Api(value = "ShowController", description = "对剧院、演出、场馆等进行操作", position = 1)
public class ShowController {

    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ApiCaseService apiCaseService;

    @ApiOperation(value = "展示列表请求接口", notes = "展示列表请求接口")
    @GetMapping("/getApiCases/{apiId}")
    public ResponseBean getApiCases(@PathVariable("apiId")int apiId){
        ResponseBean responseBean = new ResponseBean();
        List<ApiCaseBean> lists= apiCaseService.getApiCases(apiId);
        responseBean.setData(lists);
        return responseBean;
    }
}
