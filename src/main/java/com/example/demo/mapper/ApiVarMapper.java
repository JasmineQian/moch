package com.example.demo.mapper;

import com.example.demo.bean.ApiVarBean;

import java.util.List;

public interface ApiVarMapper {

    List<ApiVarBean> getApiVars(int apiId);

    ApiVarBean getApiVar(int id);

    int add(ApiVarBean apiVarBean);

    int update(ApiVarBean apiVarBean);

    int delete(int id);

    List<ApiVarBean> getMustVars(int apiId);

    List<ApiVarBean> getMaxLengthVars(int apiId);

    List<ApiVarBean> CheckAllVar(int apiId);
}
