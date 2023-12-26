package com.example.autowiringXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String[] args) {

    System.out.println("Test Autowiring XML");

    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "com/example/autowiringXml/config.xml")) {

      Vehicle vehicleInstance = context.getBean("vehicleOne", Vehicle.class);

      System.out.println(vehicleInstance);

    }

  }

}
