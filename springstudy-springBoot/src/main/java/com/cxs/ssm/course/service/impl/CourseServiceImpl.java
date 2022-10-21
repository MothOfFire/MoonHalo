package com.cxs.ssm.course.service.impl;

import com.cxs.ssm.course.dao.CourseMapper;
import com.cxs.ssm.course.model.Course;
import com.cxs.ssm.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//定义服务接口的实现类
//使用@Service注解声明，让spring去创建一个服务对象
@Service("courseService")
public class CourseServiceImpl implements CourseService {
    //使用@Autowired注解自动绑定CourseMapper接口对象
    //mapper只有运行时才创建
    @Autowired
    private CourseMapper mapper;

    @Override
    public void addCourse(Course course) {
        mapper.addCourse(course);
    }

    @Override
    public void updateCourse(Course course) {
        mapper.updateCourse(course);
    }

    @Override
    public void deleteCourse(int courseId) {
        mapper.deleteCourse(courseId);
    }

    @Override
    public Course findCourseById(int courseId) {
        return mapper.findCourseById(courseId);
    }

    @Override
    public List<Course> findAllCourses() {
        return mapper.findAllCourses();
    }
}
