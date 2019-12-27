package com.moretickets.platform.service;

import com.moretickets.platform.bean.ApiInfoBean;

import java.util.List;

public interface ApiInfoService {

    List<ApiInfoBean> getApis();

    ApiInfoBean getApi(int id);

    int add(ApiInfoBean apiInfoBean);

    int update(ApiInfoBean apiInfoBean);

    int delete(int id);

}
