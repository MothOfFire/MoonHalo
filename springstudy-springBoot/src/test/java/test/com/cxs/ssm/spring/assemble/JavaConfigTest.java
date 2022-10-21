package test.com.cxs.ssm.spring.assemble;

import com.cxs.ssm.spring.assemble.javaconfig.Clazz;
import com.cxs.ssm.spring.assemble.javaconfig.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
    public static void main(String[] args) {
        //创建容器
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        //取对象
        Clazz clazz = (Clazz) ac.getBean("clazz");
        //打印出来
        System.out.println("使⽤javaconfig装配bean:");
        System.out.println(clazz.toString());
    }
}
