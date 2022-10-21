package com.cxs.ssm.spring.instance;

public class Cookie {
    private String type;
    private String productTime;

    public Cookie(){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductTime() {
        return productTime;
    }

    public void setProductTime(String productTime) {
        this.productTime = productTime;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "type='" + type + '\'' +
                ", productTime='" + productTime + '\'' +
                '}';
    }
}
