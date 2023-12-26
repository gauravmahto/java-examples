package com.example.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    System.out.println("Hello Test!");

    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        new String[] { "com/example/collections/config.xml" })) {

      Emp empOne = (Emp) context.getBean("empOne");

      System.out.println(empOne);

      System.out.println(empOne.getSecondaryPhones().getClass().getName());

    }

  }

}
