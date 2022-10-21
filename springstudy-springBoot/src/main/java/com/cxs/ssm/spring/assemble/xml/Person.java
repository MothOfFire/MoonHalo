package com.cxs.ssm.spring.assemble.xml;

public class Person {
    private int id = 2001001;
    private String name = "";
    private String sex;
    private String email;

    public Person(int id, String name, String sex, String email) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    public  Person(){

    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
