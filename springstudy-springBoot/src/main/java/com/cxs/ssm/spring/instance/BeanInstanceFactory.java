package com.cxs.ssm.spring.instance;

public class BeanInstanceFactory {
    // 使⽤createCookie前
    // 需要先实例化BeanInstanceFactory，才能调⽤
    public Cookie createCookie(){
        Cookie cookie = new Cookie();
        cookie.setType("巧克⼒饼⼲");
        cookie.setProductTime("2010-01-03");
        return cookie;
    }
}
