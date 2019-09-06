package com.example.demo.config;

import com.example.demo.utils.DigestUtils;
import org.junit.Test;


public class TestIDgeneration {

    @Test
    public void generationID(){
        GenerateRandomId g = new GenerateRandomId();

        for(int i=0;i<50;i++){
            String data =g.generate();
            System.out.println(data);
        }
    }


    @Test
    public void genID2Md5(){
        GenerateRandomId g = new GenerateRandomId();

        for(int i=0;i<5;i++){
            String data =g.generate();
            String value = DigestUtils.md5Hex(data);
            System.out.println(data + "  " +value);
        }
    }
}
