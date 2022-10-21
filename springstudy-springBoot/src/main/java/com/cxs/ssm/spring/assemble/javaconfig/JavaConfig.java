package com.cxs.ssm.spring.assemble.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.**.javaconfig")
public class JavaConfig {
    @Bean
    @Scope("prototype")
    public Teacher teacher(){
        return new Teacher();
    }

    @Bean
    public Clazz clazz(Teacher teacher){
        return new Clazz(teacher);
    }
}
