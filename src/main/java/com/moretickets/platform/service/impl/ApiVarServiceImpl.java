package com.moretickets.platform.service.impl;

import com.moretickets.platform.bean.ApiVarBean;
import com.moretickets.platform.mapper.ApiVarMapper;
import com.moretickets.platform.service.ApiVarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiVarServiceImpl implements ApiVarService {

    @Autowired
    ApiVarMapper apiVarMapper;

    @Override
    public List<ApiVarBean> getApiVars(int apiId) {
        List<ApiVarBean> lists = apiVarMapper.getApiVars(apiId);
        return lists;
    }

    @Override
    public ApiVarBean getApiVar(int id) {
        ApiVarBean apiVarBean=apiVarMapper.getApiVar(id);
        return apiVarBean;
    }

    @Override
    public int add(ApiVarBean apiVarBean) {
        int count = apiVarMapper.add(apiVarBean);
        return count;
    }

    @Override
    public int update(ApiVarBean apiVarBean) {
        int count = apiVarMapper.update(apiVarBean);
        return count;
    }

    @Override
    public int delete(int id) {
        int count = apiVarMapper.delete(id);
        return count;
    }

    @Override
    public List<ApiVarBean> getMustVars(int apiId) {
        List<ApiVarBean> lists = apiVarMapper.getMustVars(apiId);
        return lists;
    }

    @Override
    public List<ApiVarBean> getMaxLengthVars(int apiId) {
        List<ApiVarBean> lists = apiVarMapper.getMaxLengthVars(apiId);
        return lists;
    }


}
