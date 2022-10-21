package com.cxs.ssm.mybatis.model;

public class Book {
    private int id;
    private String name;
    private String publisher;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("id=");
        stringBuffer.append(id);
        stringBuffer.append("\n");
        stringBuffer.append("name=");
        stringBuffer.append(name);
        stringBuffer.append("\n");
        stringBuffer.append("publisher=");
        stringBuffer.append(publisher);
        stringBuffer.append("\n");
        stringBuffer.append("price=");
        stringBuffer.append(price);
        return stringBuffer.toString();
    }
}
