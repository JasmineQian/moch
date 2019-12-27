package com.moretickets.platform.utils;

public interface MailService {
    //html的模板样式
    void sendHtmlMail(String to, String cc,String subject, String content,String img);

}
