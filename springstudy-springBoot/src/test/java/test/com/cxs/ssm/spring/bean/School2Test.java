package test.com.cxs.ssm.spring.bean;

import com.cxs.ssm.spring.bean.School2;
import com.cxs.ssm.spring.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School2Test {
    public static void main(String[] args) {
        //1、实例化spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //获得school2对象
        School2 sc = (School2) ac.getBean("school2");
        //3、调⽤school2对象的getStudent⽅法,获得school2⾥⾯的student对象
        Student s = (Student) sc.getStudent();
        //4、打印输出student对象,如果输出正确,则表示依赖注⼊成功
        System.out.println(sc.toString());
    }
}
