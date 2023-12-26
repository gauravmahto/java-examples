package com.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeUsingInterfaceImpl implements InitializingBean, DisposableBean {
  private String dob;
  private double age;

  public LifeUsingInterfaceImpl() {
    System.out.println("LifeUsingInterfaceImpl default ctor");
  }

  public LifeUsingInterfaceImpl(String dob, double age) {
    System.out.println("LifeUsingInterfaceImpl (String dob, double age) ctor");
    this.dob = dob;
    this.age = age;
  }

  @Override
  public String toString() {
    return "LifeUsingInterfaceImpl [dob=" + dob + ", age=" + age + "]";
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("Inside LifeUsingInterfaceImpl destroy()");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    // Works as init, since done after Set
    System.out.println("Inside LifeUsingInterfaceImpl afterPropertiesSet() like init");
  }
}
