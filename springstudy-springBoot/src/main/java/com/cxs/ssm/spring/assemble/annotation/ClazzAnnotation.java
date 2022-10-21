package com.cxs.ssm.spring.assemble.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("clazzAnnotation")
public class ClazzAnnotation {
    private int id = 2001;
    private String name = "2001班";
    //⽅法⼀ 可以使⽤属性注⼊(使⽤这种⽅法,则必须有⼀个⽆参数构造函数)
    //@Autowired
    private TeacherAnnotation teacherAnnotation;//辅导员
    //⽆参的构造函数
    public ClazzAnnotation() {

    }

    //⽅法⼆ 可以通过构造函数⾃动注⼊teacherAnnotation对象
    @Autowired
    public ClazzAnnotation(TeacherAnnotation teacherAnnotation) {
        this.teacherAnnotation = teacherAnnotation;
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

    public TeacherAnnotation getTeacherAnnotation() {
        return teacherAnnotation;
    }

    public void setTeacherAnnotation(TeacherAnnotation teacherAnnotation) {
        this.teacherAnnotation = teacherAnnotation;
    }

    @Override
    public String toString() {
        return "ClazzAnnotation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacherAnnotation=" + teacherAnnotation.toString() +
                '}';
    }
}
