package test.com.cxs.ssm.spring.assemble;

import com.cxs.ssm.spring.assemble.annotation.ClazzAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args){
        //创建容器
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-config.xml");
        //获得ClazzAnnotation对象
        ClazzAnnotation clazz = (ClazzAnnotation) ac.getBean("clazzAnnotation");
        //打印出来
        System.out.println(clazz.toString());
    }
}
