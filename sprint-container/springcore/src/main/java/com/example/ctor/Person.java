package com.example.ctor;

public class Person {

  private String name;
  private String strAge;
  private int age;
  private PersonCode code;

  public Person() {
    super();
  }

  public Person(String name, int age, PersonCode code) {
    super();
    this.name = name;
    this.age = age;
    this.code = code;
  }

  public Person(String name, String age, PersonCode code) {
    super();
    this.name = name;
    this.strAge = age;
    this.code = code;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", strAge=" + strAge + ", age=" + age + ", code=" + code + "]";
  }

}
