package com.example.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "com/example/stereotype/annotations/config.xml")) {

      Student studentInstance = context.getBean("student", Student.class);
      DatabaseC databaseCInstance = context.getBean("dbInstance", DatabaseC.class);

      System.out.println(studentInstance);
      System.out.println(databaseCInstance);

    }

  }

}
