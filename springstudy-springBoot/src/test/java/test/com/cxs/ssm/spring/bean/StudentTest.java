package test.com.cxs.ssm.spring.bean;

import com.cxs.ssm.spring.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        //1 创建spring容器
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("spring-config.xml");
        //2 通过id或者name获得java对象,需要类型转换
        Student s=(Student) ac.getBean("student");
        //3 使⽤对象
        s.setId(19851261);
        s.setName("陈栩生");
        s.setSex("男");
        s.setEmail("cxs@hbxy.edu.cn");
        System.out.println(s.toString());
    }
}
