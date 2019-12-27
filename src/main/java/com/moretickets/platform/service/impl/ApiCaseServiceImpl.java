package com.moretickets.platform.service.impl;

import com.moretickets.platform.bean.ApiCaseBean;
import com.moretickets.platform.mapper.ApiCaseMapper;
import com.moretickets.platform.service.ApiCaseService;
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
