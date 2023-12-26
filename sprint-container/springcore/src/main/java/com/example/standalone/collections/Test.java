package com.example.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    System.out.println("Test com.example.standalone.collections.Test");

    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "com/example/standalone/collections/config.xml")) {

      Person personInstance = context.getBean("personOne", Person.class);

      System.out.println(personInstance);
      System.out.println(personInstance.getFriends().getClass().getName());
      System.out.println(personInstance.getFriendsMap().getClass().getName());
      System.out.println(personInstance.getProperties().getClass().getName());

    }

  }

}
