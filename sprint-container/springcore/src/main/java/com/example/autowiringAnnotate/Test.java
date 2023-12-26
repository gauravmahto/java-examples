package com.example.autowiringAnnotate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    System.out.println("Test Autowiring Annotate XML");

    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "com/example/autowiringAnnotate/config.xml")) {

      Vehicle vehicleInstance = context.getBean("vehicleOne", Vehicle.class);

      System.out.println(vehicleInstance);

    }

  }

}
