package test.com.cxs.ssm.spring.scope;

import com.cxs.ssm.spring.scope.IceCream;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IceCreamScopeTest {
    public static void main(String[] args){
        //1、实例化spring容器
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-config.xml");
        //2、连续获得两个iceCream1,⽐较两个实例的对象号
        IceCream iceCream1_1 = (IceCream) ac.getBean("iceCream1");
        IceCream iceCream1_2 = (IceCream) ac.getBean("iceCream1");
        System.out.println("iceCream1通过singleton⽅式⽣成:");
        System.out.println(iceCream1_1.toString());
        System.out.println(iceCream1_2.toString());
        //3、连续获得两个iceCream2,⽐较两个实例的对象号
        IceCream iceCream2_1 = (IceCream) ac.getBean("iceCream2");
        IceCream iceCream2_2 = (IceCream) ac.getBean("iceCream2");
        System.out.println("iceCream2通过prototype⽅式⽣成:");
        System.out.println(iceCream2_1.toString());
        System.out.println(iceCream2_2.toString());
    }
}
