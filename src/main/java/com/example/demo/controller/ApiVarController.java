package com.example.demo.controller;

import com.example.demo.bean.ApiVarBean;
import com.example.demo.common.commoResponse;
import com.example.demo.servet.ResponseBean;
import com.example.demo.service.ApiVarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="apiVar")
@Api(value = "ApiVarController", description = "对后台接口的变量进行增删查改", position = 1)
public class ApiVarController {

    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ApiVarService apiVarService;

    @ApiOperation(value = "展示列表请求接口", notes = "展示列表请求接口")
    @GetMapping("/getApiVars/{apiId}")
    public ResponseBean getApiVars(@PathVariable("apiId")int apiId){
        ResponseBean responseBean = new ResponseBean();
        List<ApiVarBean> lists= apiVarService.getApiVars(apiId);
        responseBean.setData(lists);
        return responseBean;
    }

    @ApiOperation(value = "展示一个接口", notes = "展示一个接口")
    @GetMapping("/getApi/{id}")
    public ResponseBean getApi(@PathVariable("id") int id){
        ResponseBean responseBean = new ResponseBean();
        ApiVarBean list= apiVarService.getApiVar(id);
        responseBean.setData(list);
        return responseBean;
    }

    @ApiOperation(value = "更新接口信息", notes = "更新接口信息")
    @PostMapping("/update")
    public ResponseBean update(@RequestBody ApiVarBean apiVarBean){
        int count= apiVarService.update(apiVarBean);
        return commoResponse.checkCountResponse(count);
    }



    @ApiOperation(value = "新增接口信息", notes = "新增接口信息")
    @PostMapping("/add")
    public ResponseBean add(@RequestBody ApiVarBean apiInfoBean){
        int count= apiVarService.add(apiInfoBean);
        return commoResponse.checkCountResponse(count);
    }


    @ApiOperation(value = "逻辑删除接口信息", notes = "逻辑删除接口信息")
    @PostMapping("/delete")
    public ResponseBean add(@RequestBody int  id) {
        int count = apiVarService.delete(id);
        return commoResponse.checkCountResponse(count);
    }

}
