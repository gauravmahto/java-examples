package com.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeAnnotation {

  private String dob;
  private double age;

  public LifeAnnotation() {
    System.out.println("LifeAnnotation default ctor");
  }

  public LifeAnnotation(String dob, double age) {
    System.out.println("LifeAnnotation (String dob, double age) ctor");
    this.dob = dob;
    this.age = age;
  }

  @Override
  public String toString() {
    return "LifeAnnotation [dob=" + dob + ", age=" + age + "]";
  }

  @PostConstruct
  public void start() {
    System.out.println("Inside LifeAnnotation start() like init");
  }

  @PreDestroy
  public void end() {
    System.out.println("Inside LifeAnnotation end() like destroy");
  }

}
