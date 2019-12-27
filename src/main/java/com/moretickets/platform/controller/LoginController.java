package com.moretickets.platform.controller;


import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
@Api(value = "LoginController", description = "对登录LoginController的接口汇集", position = 1)
public class LoginController {


    @Value("${sys.dateformat}")
    private String dateformat;

    @GetMapping({"/", "/index", "/home"})
    public String index() {
        return "index";
    }


    @GetMapping("/time")
    public String time() {
        Date dt = new Date();
        SimpleDateFormat dateFormatter =new SimpleDateFormat(dateformat);
        String date = dateFormatter.format(dt);
        return "现在的时间是"+date;
    }

    @GetMapping("/underBuild")
    public String underBuild() {
        return "underBuild";
    }

    @GetMapping("/news")
    public String news() {return "about/news";}

    @GetMapping("/contact")
    public String contact() {return "about/contact";}

    @GetMapping("/guide")
    public String guide() {return "about/guide";}

    @GetMapping("/donate")
    public String donate() {return "about/donate";}
}
