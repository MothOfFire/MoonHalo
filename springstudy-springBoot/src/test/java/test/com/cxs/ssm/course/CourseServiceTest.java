package test.com.cxs.ssm.course;

import com.cxs.ssm.course.model.Course;
import com.cxs.ssm.course.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CourseServiceTest {
    public static void main(String[] args) {
        //1
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-integration.xml");
        //2.获得service对象
        //可以通过service的bean的名称，也可以通过类的类型名获得bean
        CourseService service = (CourseService) ac.getBean("courseService");
//        CourseService service = (CourseService) ac.getBean(CourseService.class);
//        //3使用service操作数据库
//        //3.1添加
//        Course course = new Course();
//        course.setCourseTitle("Web编程技术");
//        course.setCourseCode("10001");
//        course.setCourseType("专业必修");
//        course.setCourseCredit("4");
//        course.setCourseHours("64");
//        course.setTerm("2-2");
//        course.setCourseDesc("Web spring");
//        service.addCourse(course);
        //3.2 删除
//        service.deleteCourse(2);
        //3.3 根据id查询
//      Course course1= service.findCourseById(1);
//      System.out.println(course1);
      //3.4 修改
      Course course =new Course();
      course.setCourseId(3);
      course.setCourseTitle("C语⾔");
      course.setCourseCode("JX02S1001");
      course.setCourseType("专业课/必修");
      course.setCourseCredit("4");
      course.setCourseHours("64");
      course.setTerm("第⼆学年第1学期");
      course.setCourseDesc("学习C语⾔");
      service.updateCourse(course);
        //3.5 查询所有
        List<Course> list= service.findAllCourses();
        for(Course c : list) {
            System.out.println(c.toString());
        }
    }
}
