package com.example.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "config.xml" })) {

            Student student = (Student) context.getBean("studentOne");

            System.out.println(student);

        }

    }
}
