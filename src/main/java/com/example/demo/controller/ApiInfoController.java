package com.example.demo.controller;


import com.example.demo.bean.ApiInfoBean;
import com.example.demo.common.commoResponse;
import com.example.demo.servet.ResponseBean;
import com.example.demo.service.ApiInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="apiInfo")
@Api(value = "ApiInfoController", description = "对后台API接口的进行增删查改", position = 0)
public class ApiInfoController {

    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ApiInfoService apiInfoService;

    @ApiOperation(value = "展示列表请求接口", notes = "展示列表请求接口")
    @ApiImplicitParam(dataType = "", name = "", value = "展示列表请求接口")
    @GetMapping("/getApis")
    public ResponseBean getApis(){
        ResponseBean responseBean = new ResponseBean();
        List<ApiInfoBean> lists= apiInfoService.getApis();
        responseBean.setData(lists);
        return responseBean;
    }

    @ApiOperation(value = "展示一个接口", notes = "展示一个接口")
    @GetMapping("/getApi/{id}")
    public ResponseBean getApi(@PathVariable("id") int id){
        ResponseBean responseBean = new ResponseBean();
        ApiInfoBean list= apiInfoService.getApi(id);
        responseBean.setData(list);
        return responseBean;
    }

    @ApiOperation(value = "更新接口信息", notes = "更新接口信息")
    @PostMapping("/update")
    public ResponseBean update(@RequestBody ApiInfoBean apiInfoBean){
        int count= apiInfoService.update(apiInfoBean);
        return commoResponse.checkCountResponse(count);
    }



    @ApiOperation(value = "新增接口信息", notes = "新增接口信息")
    @PostMapping("/add")
    public ResponseBean add(@RequestBody ApiInfoBean apiInfoBean){
        int count= apiInfoService.add(apiInfoBean);
        return commoResponse.checkCountResponse(count);
    }


    @ApiOperation(value = "逻辑删除接口信息", notes = "逻辑删除接口信息")
    @PostMapping("/delete")
    public ResponseBean add(@RequestBody int  id) {
        int count = apiInfoService.delete(id);
        return commoResponse.checkCountResponse(count);
    }

}
