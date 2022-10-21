package com.cxs.ssm.spring.bean;

public class School1 {
    private int schoolId = 100001;
    private String schoolName = "hbxy";
    private Student student;

    /**
     * 创建school对象时,构造器传⼊⼀个参数
     * @param s
     */

    public School1(Student s){
        this.student = s;
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
        return "School1{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                ", student=" + student.toString() +
                '}';
    }
}
