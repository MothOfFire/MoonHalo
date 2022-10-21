package test.com.cxs.ssm.spring.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAssembleTest {
    public static void main(String[] args){
        //1、实例化spring容器
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("spring-config.xml");
        //2、获得并打印person对象
        System.out.println("使⽤xml装配bean:");
        System.out.println(ac.getBean("person1"));
        System.out.println(ac.getBean("person2"));
    }
}
