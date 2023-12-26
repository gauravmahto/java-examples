package com.example.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    System.out.println("Test Life");

    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/lifecycle/config.xml")) {

      // Life lifeInstance = (Life) context.getBean("lifeOne");

      // System.out.println(lifeInstance);

      // LifeUsingInterfaceImpl lifeImplInstance = (LifeUsingInterfaceImpl) context.getBean("lifeImplOne");

      // System.out.println(lifeImplInstance);

      LifeAnnotation lifeImplInstance = (LifeAnnotation) context.getBean("lifeAnnoOne");

      System.out.println(lifeImplInstance);

    }

  }

}
