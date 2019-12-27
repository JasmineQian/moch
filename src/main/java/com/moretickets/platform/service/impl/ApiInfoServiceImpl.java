package com.moretickets.platform.service.impl;

import com.moretickets.platform.bean.ApiInfoBean;
import com.moretickets.platform.mapper.ApiInfoMapper;
import com.moretickets.platform.service.ApiInfoService;
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
