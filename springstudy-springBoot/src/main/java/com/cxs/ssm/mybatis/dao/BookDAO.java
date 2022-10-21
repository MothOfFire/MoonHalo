package com.cxs.ssm.mybatis.dao;

import com.cxs.ssm.mybatis.model.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BookDAO {

    private SqlSession getSession() throws IOException {
        // 1、读取配置⽂件(读取mybatis配置)
        String resource = "mybatis-config.xml";
        InputStream inputStream =
                Resources.getResourceAsStream(resource);
        // 2、根据配置⽂件构建SqlSessionFactory(创建一个会话工厂)
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        // 3、通过SqlSessionFactory创建SqlSession（打开一个会话）
        SqlSession sqlSession =
                sqlSessionFactory.openSession();
        return sqlSession;
    }

    /*根据图书编号查询图书信息*/
    public Book findBookById(int id) throws Exception {
        //1-3步移动到getSession（）方法里
//        // 1、读取配置⽂件(读取mybatis配置)
//        String resource = "mybatis-config.xml";
//        InputStream inputStream =
//                Resources.getResourceAsStream(resource);
//        // 2、根据配置⽂件构建SqlSessionFactory(创建一个会话工厂)
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(inputStream);
//        // 3、通过SqlSessionFactory创建SqlSession（打开一个会话）
//        SqlSession sqlSession =
//                sqlSessionFactory.openSession();
        // 4、SqlSession执⾏映射⽂件中定义的SQL，并返回映射结果（通过会话访问映射对象的方法，通过命名空间找到映射文件）
        Book book =
                getSession().selectOne("com.cxs.ssm.mybatis.mapper.BookMapper.findBookById", id);
        // 5、关闭SqlSession并返回结果
        getSession().close();
        return book;
    }
    /*根据图书名称来模糊查询图书信息列表*/
    public List<Book> findBookByName(String s) throws Exception{
//        // 1、读取配置⽂件
//        String resource = "mybatis-config.xml";
//        InputStream inputStream =
//                Resources.getResourceAsStream(resource);
//        // 2、根据配置⽂件构建SqlSessionFactory
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(inputStream);
//        // 3、通过SqlSessionFactory创建SqlSession
//        SqlSession sqlSession =
//                sqlSessionFactory.openSession();
        // 4、SqlSession执⾏映射⽂件中定义的SQL，并返回映射结果
        List<Book> books =
                getSession().selectList("com.cxs.ssm.mybatis.mapper.BookMapper.findBookByName", s);
        // 5、关闭SqlSession
        getSession().close();
        return books;
    }
    /*查询所有图书信息列表*/
    public List<Book> findAllBook() throws Exception{
//        // 1、读取配置⽂件
//        String resource = "mybatis-config.xml";
//        InputStream inputStream =
//                Resources.getResourceAsStream(resource);
//        // 2、根据配置⽂件构建会话SqlSessionFactory
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(inputStream);
//        // 3、通过会话SqlSessionFactory创建SqlSession
//        SqlSession sqlSession =
//                sqlSessionFactory.openSession();
        // 4、SqlSession执⾏映射⽂件中定义的SQL，并返回映射结果
        List<Book> books =
                getSession().selectList("com.cxs.ssm.mybatis.mapper.BookMapper.findAllBook");
        // 5、关闭SqlSession
        getSession().close();
        return books;
    }
    /*添加图书*/
    public void addBook(Book book) throws Exception{
//        // 1、读取配置⽂件
//        String resource = "mybatis-config.xml";
//        InputStream inputStream =
//                Resources.getResourceAsStream(resource);
//        // 2、根据配置⽂件构建SqlSessionFactory
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(inputStream);
//        // 3、通过SqlSessionFactory创建SqlSession
//        SqlSession sqlSession =
//                sqlSessionFactory.openSession();
        // 4、SqlSession执⾏添加操作
        // 4.1执⾏SqlSession的插⼊⽅法，返回的是SQL语句影响的⾏数
        int rows =
                getSession().insert("com.cxs.ssm.mybatis.mapper.BookMapper.addBook", book);
        // 4.2通过返回结果判断插⼊操作是否执⾏成功
        if(rows > 0){
            System.out.println("您成功插⼊了"+rows+"条数据！");
        }else{
            System.out.println("执⾏插⼊操作失败！！！");
        }
        // 4.3提交事务
        getSession().commit();
        // 5、关闭SqlSession
        getSession().close();
    }
    /*更新图书*/
    public void updateBook(Book book) throws Exception{
//        // 1、读取配置⽂件
//        String resource = "mybatis-config.xml";
//        InputStream inputStream =
//                Resources.getResourceAsStream(resource);
//        // 2、根据配置⽂件构建SqlSessionFactory
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(inputStream);
//        // 3、通过SqlSessionFactory创建SqlSession
//        SqlSession sqlSession =
//                sqlSessionFactory.openSession();
        // 4、SqlSession执⾏更新操作
        // 4.1执⾏SqlSession的更新⽅法，返回的是SQL语句影响的⾏数
        int rows =
                getSession().update("com.cxs.ssm.mybatis.mapper.BookMapper.updateBook", book);
        // 4.2通过返回结果判断更新操作是否执⾏成功
        if(rows > 0){
            System.out.println("您成功修改了"+rows+"条数据！");
        }else{
            System.out.println("执⾏修改操作失败！！！");
        }
        // 4.3提交事务
        getSession().commit();
        // 5、关闭SqlSession
        getSession().close();
    }
    /*删除图书*/
    public void deleteBook(int id) throws Exception{
//        // 1、读取配置⽂件
//        String resource = "mybatis-config.xml";
//        InputStream inputStream =
//                Resources.getResourceAsStream(resource);
//        // 2、根据配置⽂件构建SqlSessionFactory
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(inputStream);
//        // 3、通过SqlSessionFactory创建SqlSession
//        SqlSession sqlSession =
//                sqlSessionFactory.openSession();
        // 4、SqlSession执⾏删除操作
        // 4.1执⾏SqlSession的删除⽅法，返回的是SQL语句影响的⾏数
        int rows =
                getSession().delete("com.cxs.ssm.mybatis.mapper.BookMapper.deleteBook", id);
                        // 4.2通过返回结果判断删除操作是否执⾏成功
        if(rows > 0){
            System.out.println("您成功删除了"+rows+"条数据！");
        }else{
            System.out.println("执⾏删除操作失败！！！");
        }
        // 4.3提交事务
        getSession().commit();
        // 5、关闭SqlSession
        getSession().close();
    }
}
