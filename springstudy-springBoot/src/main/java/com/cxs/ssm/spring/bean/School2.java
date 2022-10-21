package com.cxs.ssm.spring.bean;
/**
 * 属性赋值注⼊,要求
 * 1 必须存在⼀个⽆参数的构造函数
 * 2 必须存在⼀个属性:student
 * 3 必须存在属性的setter⽅法:setStudent(Student student)
 */
public class School2 {
    private int schoolId = 10002;
    private String schoolName = "沧州交通学院";
    private Student student;

    public School2(String name){
        this.schoolName = name;
    }

    public School2(){

    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "School2{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                ", student=" + student.toString() +
                '}';
    }
}
