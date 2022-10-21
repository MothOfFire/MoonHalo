package test.com.cxs.ssm.spring.jdbc;

import com.cxs.ssm.spring.bean.Student;
import com.cxs.ssm.spring.jdbc.StudentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentDAOTest {
    public static void main(String[] args) {
        //1 读取spring-jdbc-config.xml配置⽂件
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-jdbc-config.xml");
        //2 获得dao对象
        StudentDAO dao = (StudentDAO) ctx.getBean("studentDAO");
        //3 使⽤dao对数据库进⾏操作
        //3.2 注册学⽣
        //Student student = new Student();
        //student.setName("李四");
        //student.setSex("01");
        //student.setEmail("lisi@cn.cn");
        //dao.addStudent(student);
        //修改学⽣（找已经添加的数据）
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("李四11111");
        student1.setSex("01");
        student1.setEmail("lisi@cn.cn");
        dao.updateStudent(student1);
        //删除学⽣（找已经添加的数据）
        //dao.deleteStudent(3);
        //3.3 查询所有学⽣
        List<Student> list = dao.findAll();
        System.out.println("所有⽤户数=" + list.size());
        for (int i = 0; i < list.size(); i++) {
            Student student2 = (Student) list.get(i);
            System.out.println("id=" + student2.getId() + " " + "name=" +
                    student2.getName()+" "+"email="+student2.getEmail());
        }
    }
}
