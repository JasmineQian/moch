package com.example.demo.service.impl;

import com.example.demo.bean.ApiCaseBean;
import com.example.demo.mapper.ApiCaseMapper;
import com.example.demo.service.ApiCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiCaseServiceImpl implements ApiCaseService {

    @Autowired
    ApiCaseMapper apiCaseMapper;


    @Override
    public List<ApiCaseBean> getApiCases(int apiId) {
        List<ApiCaseBean> lists=apiCaseMapper.getApiCases(apiId);
        return lists;
    }

    @Override
    public ApiCaseBean getApiCase(int id) {
        ApiCaseBean apiCaseBean =apiCaseMapper.getApiCase(id);
        return apiCaseBean;
    }

    @Override
    public int add(ApiCaseBean apiCaseBean) {
        int count = apiCaseMapper.add(apiCaseBean);
        return count;
    }

    @Override
    public int update(ApiCaseBean apiCaseBean) {
        int count = apiCaseMapper.update(apiCaseBean);
        return count;
    }

    @Override
    public int delete(int id) {
        int count = apiCaseMapper.delete(id);
        return count;
    }

    @Override
    public int deleteByTypeid(ApiCaseBean apiCaseBean) {
        int count = apiCaseMapper.deleteByTypeid(apiCaseBean);
        return count;
    }
}
