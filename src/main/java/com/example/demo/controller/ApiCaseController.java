package com.example.demo.controller;

import com.example.demo.bean.ApiCaseBean;
import com.example.demo.common.commoResponse;
import com.example.demo.servet.ResponseBean;
import com.example.demo.service.ApiCaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="apiCase")
@Api(value = "ApiCaseController", description = "对后台接口的测试用例进行增删查改", position = 1)
public class ApiCaseController {

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

    @ApiOperation(value = "展示一个接口", notes = "展示一个接口")
    @GetMapping("/getApiCase/{id}")
    public ResponseBean getApiCase(@PathVariable("id") int id){
        ResponseBean responseBean = new ResponseBean();
        ApiCaseBean apiCaseBean= apiCaseService.getApiCase(id);
        responseBean.setData(apiCaseBean);
        return responseBean;
    }

    @ApiOperation(value = "更新接口信息", notes = "更新接口信息")
    @PostMapping("/update")
    public ResponseBean update(@RequestBody ApiCaseBean apiCaseBean){
        int count= apiCaseService.update(apiCaseBean);
        return commoResponse.checkCountResponse(count);
    }



    @ApiOperation(value = "新增接口信息", notes = "新增接口信息")
    @PostMapping("/add")
    public ResponseBean add(@RequestBody ApiCaseBean apiCaseBean){
        int count= apiCaseService.add(apiCaseBean);
        return commoResponse.checkCountResponse(count);
    }


    @ApiOperation(value = "逻辑删除接口信息", notes = "逻辑删除接口信息")
    @PostMapping("/delete")
    public ResponseBean add(@RequestBody int  id) {
        int count = apiCaseService.delete(id);
        return commoResponse.checkCountResponse(count);
    }

}
