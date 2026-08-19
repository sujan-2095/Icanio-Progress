package com.trial;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        BeanFactory container = context;

        Student student =
                container.getBean("s1", Student.class);

        System.out.println(student.getClass());

        student.study();
    }
}