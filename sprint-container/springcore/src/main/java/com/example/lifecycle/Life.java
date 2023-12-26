package com.example.lifecycle;

public class Life {

  private String dob;
  private double age;

  public Life() {
    System.out.println("Life default ctor");
  }

  public Life(String dob, double age) {
    System.out.println("Life (String dob, double age) ctor");
    this.dob = dob;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Life [dob=" + dob + ", age=" + age + "]";
  }

  public void init() {
    System.out.println("Inside Life init()");
  }

  public void destroy() {
    System.out.println("Inside Life destroy()");
  }

}
