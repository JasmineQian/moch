package com.moretickets.platform.apivar2case;

import com.alibaba.fastjson.JSONObject;
import com.moretickets.platform.bean.ApiCaseBean;
import com.moretickets.platform.bean.ApiVarBean;
import com.moretickets.platform.common.message;
import com.moretickets.platform.service.ApiCaseService;
import com.moretickets.platform.service.ApiVarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class Var2CaseServiceImpl implements Var2CaseService {

    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    String ALLCHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String ALLINT = "123456789";

    @Autowired
    ApiVarService apiVarService;

    @Autowired
    ApiCaseService apiCaseService;

    //类型是1的异常测试用例，请求中必传值依次未传，依次进行校验
    @Override
    public void checkMustVar(int apiId) {
        List<ApiVarBean> list = apiVarService.getMustVars(apiId);
        ApiCaseBean apiCaseBean = new ApiCaseBean();
        apiCaseBean.setApiId(apiId);
        apiCaseBean.setCasetypeId(1);
        apiCaseService.deleteByTypeid(apiCaseBean);
        int max = 0;
        String body = null;
        for (int i = 0; i < list.size(); i++) {
            String var = list.get(i).getVal();
            String casename = "请求中未传入" + var + "验证返回code=" + message.ERROR_CODE_002 +"且"+var + message.ERROR_MESSAGE_002;
            String assertion= var + message.ERROR_MESSAGE_002;
            System.out.println(var);
            StringBuffer sb = new StringBuffer();
            JSONObject jsonObject = new JSONObject();
            body = jsonObject.toString();

            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).getVal() != list.get(j).getVal()) {
                    jsonObject.put(list.get(j).getVal(),list.get(j).getValsample());
                }
            }

            body = jsonObject.toString();
            System.out.println(body);
            ApiCaseBean apiCaseBean2 = new ApiCaseBean();
            apiCaseBean2.setApiId(apiId);
            apiCaseBean2.setName(casename);
            apiCaseBean2.setBody(body);
            apiCaseBean2.setAsseertion(assertion);
            apiCaseBean2.setPriorityId(3);
            apiCaseBean2.setCasetypeId(1);

            int count = apiCaseService.add(apiCaseBean2);
            System.out.println(count);
        }
    }

    //类型是2的异常测试用例，请求中必传值依次传空，依次进行校验
    @Override
    public void checkMustVarEmpty(int apiId) {
        List<ApiVarBean> list = apiVarService.getMustVars(apiId);
        ApiCaseBean apiCaseBean = new ApiCaseBean();
        apiCaseBean.setApiId(apiId);
        apiCaseBean.setCasetypeId(2);
        apiCaseService.deleteByTypeid(apiCaseBean);
        int max = 0;
        String body = null;
        for (int i = 0; i < list.size(); i++) {
            String var = list.get(i).getVal();
            String casename = "请求中未传入" + var + "为空验证返回code=" + message.ERROR_CODE_003 + "且" + var + message.ERROR_MESSAGE_003;
            String assertion = var + message.ERROR_MESSAGE_003;
            StringBuffer sb = new StringBuffer();
            JSONObject jsonObject = new JSONObject();
            body = jsonObject.toString();

            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).getVal() != list.get(j).getVal()) {
                    jsonObject.put(list.get(j).getVal(), list.get(j).getValsample());
                } else {
                    jsonObject.put(list.get(j).getVal(), "");
                }
            }

            body = jsonObject.toString();
            System.out.println(body);
            ApiCaseBean apiCaseBean2 = new ApiCaseBean();
            apiCaseBean2.setApiId(apiId);
            apiCaseBean2.setName(casename);
            apiCaseBean2.setBody(body);
            apiCaseBean2.setAsseertion(assertion);
            apiCaseBean2.setPriorityId(3);
            apiCaseBean2.setCasetypeId(2);

            int count = apiCaseService.add(apiCaseBean2);
            System.out.println(count);
        }
    }

    //类型是3的异常测试用例，请求中将有最大长度的字符串依次超过最大长度
    @Override
    public void checkStringMaxLength(int apiId) {
            List<ApiVarBean> list = apiVarService.getMaxLengthVars(apiId);
            List<ApiVarBean> listAll = apiVarService.getApiVars(apiId);
            ApiCaseBean apiCaseBean = new ApiCaseBean();
            apiCaseBean.setApiId(apiId);
            apiCaseBean.setCasetypeId(3);
            apiCaseService.deleteByTypeid(apiCaseBean);


            int max = 0;
            String body = null;
            for (int i = 0; i < list.size(); i++) {
                String var = list.get(i).getVal();
                int length = list.get(i).getInputMaxLength();
                String casename = "请求中传入" + var + "的最大长度为" + length + "实际传入的长度为" + (length + 1) + "验证返回"+ message.ERROR_CODE_004 +"且"+var + message.ERROR_MESSAGE_004;
                String assertion= var + message.ERROR_MESSAGE_004;
                StringBuffer sb = new StringBuffer();
                JSONObject jsonObject = new JSONObject();
                body = jsonObject.toString();

                for (int j = 0; j < listAll.size(); j++) {
                    Random random = new Random();
                    sb = new StringBuffer("");
                    max = listAll.get(j).getInputMaxLength();
                    if (listAll.get(i).getVal() != listAll.get(j).getVal()) {
                        jsonObject.put(listAll.get(j).getVal(),listAll.get(j).getValsample());
                    }else {
                        if(listAll.get(i).getInputTypeID()==1){
                        for (int k = 0; k <= max; k++) {
                            sb.append(ALLCHAR.charAt(random.nextInt(ALLINT.length())));
                        }
                        jsonObject.put(listAll.get(j).getVal(),sb);
                    }else if(listAll.get(i).getInputTypeID()==2){
                            for (int k = 0; k <= max; k++) {
                                sb.append(ALLCHAR.charAt(random.nextInt(ALLCHAR.length())));
                            }
                            jsonObject.put(listAll.get(j).getVal(),sb);
                    }else{
                            jsonObject.put(listAll.get(j).getVal(),"暂时不分配类型");
                        }
                    }
                }

                body = jsonObject.toString();
                System.out.println(body);
                ApiCaseBean apiCaseBean2 = new ApiCaseBean();
                apiCaseBean2.setApiId(apiId);
                apiCaseBean2.setName(casename);
                apiCaseBean2.setBody(body);
                apiCaseBean2.setAsseertion(assertion);
                apiCaseBean2.setPriorityId(3);
                apiCaseBean2.setCasetypeId(3);

                int count = apiCaseService.add(apiCaseBean2);
                System.out.println(count);
        }

    }
}
