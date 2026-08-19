package com.trial;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        BeanFactory context =
                new ClassPathXmlApplicationContext("beans.xml");

        Student student =
                context.getBean("s1", Student.class);

        System.out.println(student.getClass());

        student.study();
    }
}