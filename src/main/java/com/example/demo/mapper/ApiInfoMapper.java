package com.example.demo.mapper;

import com.example.demo.bean.ApiInfoBean;

import java.util.List;

public interface ApiInfoMapper {

    List<ApiInfoBean> getApis();

    ApiInfoBean getApi(int id);

    int add(ApiInfoBean apiInfoBean);

    int update(ApiInfoBean apiInfoBean);

    int delete(int id);
    
}
