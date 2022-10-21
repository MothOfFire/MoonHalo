package com.cxs.ssm.course.service;

import com.cxs.ssm.course.model.Course;

import java.util.List;

//对外提供服务接口，进一步封装mybatis
public interface CourseService {
    //添加
    public void addCourse(Course course);
    //修改
    public void updateCourse(Course course);
    //删除
    public void deleteCourse(int courseId);
    //通过id查询
    public Course findCourseById(int courseId);
    //查询所有
    public List<Course> findAllCourses();
}
