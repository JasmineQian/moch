package com.example.demo.service.impl;

import com.example.demo.bean.ApiInfoBean;
import com.example.demo.mapper.ApiInfoMapper;
import com.example.demo.service.ApiInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiInfoServiceImpl implements ApiInfoService {

    @Autowired
    ApiInfoMapper apiInfoMapper;

    @Override
    public List<ApiInfoBean> getApis() {
        List<ApiInfoBean> lists = apiInfoMapper.getApis();
        return lists;
    }

    @Override
    public ApiInfoBean getApi(int id) {
        ApiInfoBean info = apiInfoMapper.getApi(id);
        return info;
    }

    @Override
    public int add(ApiInfoBean apiInfoBean) {
        int count = apiInfoMapper.add(apiInfoBean);
        return count;
    }

    @Override
    public int update(ApiInfoBean apiInfoBean) {
        int count = apiInfoMapper.update(apiInfoBean);
        return count;
    }

    @Override
    public int delete(int id) {
        int count = apiInfoMapper.delete(id);
        return count;
    }
}
