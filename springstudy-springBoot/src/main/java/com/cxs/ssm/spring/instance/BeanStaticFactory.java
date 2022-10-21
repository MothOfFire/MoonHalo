package com.cxs.ssm.spring.instance;

public class BeanStaticFactory {
    public static Cookie cookieFactory(){
        Cookie cookie = new Cookie();
        cookie.setType("奶油饼干");
        cookie.setProductTime("2010-01-02");
        return cookie;
    }
}
