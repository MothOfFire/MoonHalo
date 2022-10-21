package com.cxs.ssm.spring.assemble.javaconfig;

public class Clazz {
    private int id= 2001;
    private String name = "2001班";
    private Teacher teacher;//辅导员
    /**
     * 定义⽆参构造函数
     */
    public Clazz(){
    }
    /**
     * 构造函数注⼊
     * @param teacher
     */
    public Clazz(Teacher teacher){
        this.teacher = teacher;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher.toString() +
                '}';
    }
}
