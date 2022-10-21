package com.cxs.ssm.book.controller;

import com.cxs.ssm.book.model.Book;
import com.cxs.ssm.book.model.BookDB;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class BookController {
    public BookController(){
        Book book1 = new Book();
        book1.setId((int)(new Random().nextDouble()* 1000000000));
        book1.setName("Spring实战");
        book1.setPublisher("⼈⺠邮电出版社");
        book1.setPrice(89.20);
        Book book2 = new Book();
        book2.setId((int)(new Random().nextDouble()* 1000000000));
        book2.setName("Oracle数据库技术");
        book2.setPublisher("⾼等教育出版社");
        book2.setPrice(39.20);
        Book book3 = new Book();
        book3.setId((int)(new Random().nextDouble()* 1000000000));
        book3.setName("Hadoop权威指南");
        book3.setPublisher("清华⼤学出版社");
        book3.setPrice(100.80);
        BookDB.bookMap.put(book1.getId(),book1);
        BookDB.bookMap.put(book2.getId(),book2);
        BookDB.bookMap.put(book3.getId(),book3);
    }
    @RequestMapping("/booklist")
    public String tobooklist(Model model){
        //TODO：数据库查询
        //到数据库查询
        List<Book> list = new ArrayList<Book>(BookDB.bookMap.values());
        //把数据放到model
        model.addAttribute("booklist",list);
        return "/jsp/book/book_list";
    }
//    //使⽤Request对象获得id
//    @RequestMapping("/bookdelete")
//    public String bookDelete(HttpServletRequest request, Model model) {
//        String id= request.getParameter("id");
//        StringBuffer msg = new StringBuffer();
//        msg.append("选择要删除的图书ID为：<br />");
//        msg.append("id=" + id);
//        model.addAttribute("msg", msg.toString());
//        return "/jsp/success";
//    }
    //使⽤SpringMVC进⾏基本类型绑定
    @RequestMapping("/bookdelete")
    //public String bookDelete(@RequestParam("id") int bookId, Model model)
    public String bookDelete(Integer id, Model model) {
        //spring MVC 自动从request
        //跳转到成功页面
        model.addAttribute("msg","删除了:<br>"+BookDB.bookMap.get(id).toString());
        //TODO：到数据库中删除数据
        BookDB.bookMap.remove(id);
//        StringBuffer msg = new StringBuffer();
//        msg.append("选择要删除的图书ID为：<br />");
//        msg.append("id=" + id);
//        model.addAttribute("msg", msg.toString());
        return "/jsp/success";
    }

    //跳转到添加图书⻚⾯
    @RequestMapping("/tobookadd")
    public String toBookAdd(Model model){
        //准备添加图书需要用到的数据

        return "/jsp/book/book_add";
    }
    //添加图书
    @RequestMapping("/bookadd")
    public String bookAdd(Book book, Model model){
        //TODO：保存到数据库
        Integer id= (int) (new Random().nextDouble()* 1000000000);
        book.setId(id);
        BookDB.bookMap.put(id,book);
//        StringBuffer msg = new StringBuffer();
//        msg.append("添加的图书信息为：<br/>");
//        msg.append("图书名称=" + book.getName()+"<br/>");
//        msg.append("出版社=" + book.getPublisher()+"<br/>");
//        msg.append("价格=" + book.getPrice()+"<br/>");
//        model.addAttribute("msg", msg.toString());
        //跳转到表页面：重定向redirect
        return "redirect:booklist";
//        return "/jsp/success";
    }

    //跳转到修改图书信息⻚⾯
    @RequestMapping("/tobookedit")
    public String toBookEdit(Integer id, Model model){
        //TODO:去数据库查询数据
        Book book = BookDB.bookMap.get(id);
        //模拟数据
//        Book book = new Book();
//        book.setId(1001);
//        book.setName("Spring实战");
//        book.setPublisher("⼈⺠邮电出版社");
//        book.setPrice(89.20);
        //放进model
        model.addAttribute("book",book);
        //到视图：jsp⻚⾯
        return "/jsp/book/book_edit";
    }
    //接收修改图书信息保存到数据库
    @RequestMapping("/bookedit")
    public String bookEdit(Book book, Model model){
        //TODO:
        BookDB.bookMap.put(book.getId(), book);
//        StringBuffer msg = new StringBuffer();
//        msg.append("修改的图书信息为：<br/>");
//        msg.append("图书id=" + book.getId()+"<br/>");
//        msg.append("图书名称=" + book.getName()+"<br/>");
//        msg.append("出版社=" + book.getPublisher()+"<br/>");
//        msg.append("价格=" + book.getPrice()+"<br/>");
//        model.addAttribute("msg", msg.toString());
//        //到视图：jsp⻚⾯
//        return "/jsp/success";
        return "redirect:booklist";
    }
}
