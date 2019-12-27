package com.moretickets.platform.show;

import com.moretickets.platform.config.GenerateRandomId;
import org.junit.Test;

public class generateThreater {


    @Test
    public void generateThreater01(){

        theatreVO theatreVO = new theatreVO();
        theatreVO.setCityName("qq");

        GenerateRandomId g = new GenerateRandomId();

        for(int i=0;i<50;i++){
            String data =g.generate();
            System.out.println(data);
        }
    }
}
