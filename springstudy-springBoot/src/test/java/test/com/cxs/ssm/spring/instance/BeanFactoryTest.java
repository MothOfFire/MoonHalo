package test.com.cxs.ssm.spring.instance;

import com.cxs.ssm.spring.instance.Cookie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryTest {
    public static void main(String[] args){
        //1、实例化spring容器
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-config.xml");
        //2.1、获得并打印cookie1对象
        System.out.println("通过构造器实例化cookie1");
        Cookie cookie1 = (Cookie)  ac.getBean("cookie1");
        System.out.println(cookie1.toString());
        System.out.println(ac.getBean("cookie1"));
        //2.2、获得并打印cookie2对象
        System.out.println("通过静态⼯⼚实例化cookie2:");
        Cookie cookie2 = (Cookie)  ac.getBean("cookie2");
        System.out.println(cookie2.toString());
        System.out.println(ac.getBean("cookie2"));
        //2.3、获得并打印cookie3对象
        System.out.println("通过实例⼯⼚实例化cookie3:");
        Cookie cookie3 = (Cookie)  ac.getBean("cookie3");
        System.out.println(cookie3.toString());
        System.out.println(ac.getBean("cookie3"));
    }
}
