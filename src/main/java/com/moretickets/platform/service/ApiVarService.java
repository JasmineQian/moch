package com.moretickets.platform.service;

import com.moretickets.platform.bean.ApiVarBean;

import java.util.List;

public interface ApiVarService {

    List<ApiVarBean> getApiVars(int apiId);

    ApiVarBean getApiVar(int id);

    int add(ApiVarBean apiVarBean);

    int update(ApiVarBean apiVarBean);

    int delete(int id);

    //查询出必传的入参，进行一次缺一个的遍历
    List<ApiVarBean> getMustVars(int apiId);

    List<ApiVarBean> getMaxLengthVars(int apiId);

}
