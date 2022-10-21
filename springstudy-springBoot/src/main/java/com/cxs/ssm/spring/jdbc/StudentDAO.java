package com.cxs.ssm.spring.jdbc;

import com.cxs.ssm.spring.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDAO {

    private JdbcTemplate template;
    @Autowired
    public StudentDAO(JdbcTemplate template){

        this.template = template;
    }

    public void setTemplate(JdbcTemplate jdbcTemplate){

        this.template = jdbcTemplate;
    }

    public void addStudent(Student student){
        String sql="insert into students(name,sex,email) " +
                "   values(?,?,?)";
        template.update(sql,
                student.getName(),
                student.getSex(),
                student.getEmail());
    }

    public void deleteStudent(int id){
        String sql = "delete from students where id=?";
        template.update(sql,id);
    }

    public void updateStudent(Student student){
        String sql = "update students set name=?,sex=?,email=? "
                + " where id=?";
        template.update(sql,
                student.getName(),
                student.getSex(),
                student.getEmail(),
                student.getId());
    }

    public String findNameById(int id){
        String sql = "select name from students where id=?";
        return template.queryForObject(sql,String.class,id);
    }

    public List<Student> findAll(){
        String sql = "select * from students";
        return template.query(sql,new StudentRoMapper());
    }

    public Student findById(int id){
        String sql = "select * from students where id=?";
        return template.queryForObject(sql,new StudentRoMapper(),id);
    }

   //映射转换器
    class StudentRoMapper implements RowMapper<Student>{

        @Override
        public Student mapRow(ResultSet resultSet, int i)
                throws SQLException {
            Student s = new Student();
            s.setId(resultSet.getInt("id"));
            s.setName(resultSet.getString("name"));
            s.setSex(resultSet.getString("sex"));
            s.setEmail(resultSet.getString("email"));
            return s;
        }
    }

}
