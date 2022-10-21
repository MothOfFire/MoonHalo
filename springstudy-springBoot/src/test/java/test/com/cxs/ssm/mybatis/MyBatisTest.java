package test.com.cxs.ssm.mybatis;

import com.cxs.ssm.mybatis.dao.BookDAO;
import com.cxs.ssm.mybatis.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyBatisTest {
    public static void main(String[] args) {
        try {
            ApplicationContext ac =
                    new ClassPathXmlApplicationContext("spring-mybatist.xml");
            //通过容器获得bookDAO对象
            BookDAO bookDAO = (BookDAO) ac.getBean("bookDAO");
//            //1 添加图书
//            //1.1 通过容器获得book对象
//            Book book = (Book) ac.getBean("book");
//            //1.2 设置book属性
//            book.setName("Effective Java中⽂版");
//            book.setPublisher("机械⼯业出版社");
//            book.setPrice(52.00);
//            //1.3 使⽤bookDAO对象的addBook⽅法添加图书
//            bookDAO.addBook(book);
//            //2 更新数据库中已有图书的信息
//            //2.1 获得book对象
//            Book book = (Book) ac.getBean("book");
//            //2.2 设置book属性,主键id⼀定要赋值
//            book.setId(4);
//            book.setName("Python编程-从⼊⻔到实践");
//            book.setPublisher("⼈⺠邮电出版社");
//            book.setPrice(89.00);
//            //2.3 使⽤bookDAO对象的updateBook⽅法修改图书
//            bookDAO.updateBook(book);
//          //3 通过id删除图书,id必须为表中已有的图书id
//             bookDAO.deleteBook(7);
//          //4 通过id查询图书
//          //4.1 通过bookDAO.findBookById⽅法查询图书,参数已有图书的id
//             Book tempbook = bookDAO.findBookById(1);
//          //4.2 打印查询结果
//             System.out.println("\n通过id查询图书:");
//             System.out.println(tempbook.toString());
//            //5 通过图书名称模糊查询图书
//            //5.1 通过bookDAO.findBookByName⽅法模糊查询图书
//            // 参数为已有图书的名称
//            List<Book> bookList = bookDAO.findBookByName("spring");
//            //5.2 打印查询结果
//            System.out.println("\n\n名称有spring的图书:");
//            for (Book newbook:bookList) {
//                System.out.println(newbook.toString());
//            }
            //6 查询图书
            //6.1 通过bookDAO.findAllBook查询所有图书
            List<Book> allbookList = bookDAO.findAllBook();
            //6.2 打印查询结果
            System.out.println("\n\n数据库中所有的图书:\n");
            for (Book newbook:allbookList) {
                System.out.println(newbook.toString());
            }
        } catch (Exception e) {
            //打印错误堆栈
            e.printStackTrace();
        }
    }
}
