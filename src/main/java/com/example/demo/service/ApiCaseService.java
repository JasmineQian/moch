package com.example.demo.service;

import com.example.demo.bean.ApiCaseBean;

import java.util.List;

public interface ApiCaseService {

    List<ApiCaseBean> getApiCases(int apiId);

    ApiCaseBean getApiCase(int id);

    int add(ApiCaseBean apiCaseBean);

    int update(ApiCaseBean apiCaseBean);

    int delete(int id);

    int deleteByTypeid(ApiCaseBean apiCaseBean);
}
