package com.example.ctor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    System.out.println("Test CTOR");

    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/ctor/config.xml")) {

      Person personObj = (Person) context.getBean("personOne");

      System.out.println(personObj);

    }

  }

}
