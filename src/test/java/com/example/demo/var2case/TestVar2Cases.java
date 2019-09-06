package com.example.demo.var2case;

import com.example.demo.apivar2case.Var2CaseService;
import com.example.demo.bean.ApiCaseBean;
import com.example.demo.service.ApiCaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestVar2Cases {

    @Autowired
    Var2CaseService var2CaseService;

    @Autowired
    ApiCaseService apiCaseService;

    @Test
    public void test01(){
        var2CaseService.checkMustVar(2);

        var2CaseService.checkMustVarEmpty(2);

        var2CaseService.checkStringMaxLength(2);
        List<ApiCaseBean> lists = apiCaseService.getApiCases(2);


       for(int i=0;i<lists.size();i++){
           System.out.println(lists.get(i).toString());
       }
    }
}
