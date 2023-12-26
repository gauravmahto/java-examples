package com.example.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

  @Value("Test")
  private String name;

  @Value("25")
  private int age;

  @Value("#{friendsList}")
  private List<String> friends;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public List<String> getFriends() {
    return friends;
  }

  public void setFriends(List<String> friends) {
    this.friends = friends;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + ", friends=" + friends + "]";
  }

}
