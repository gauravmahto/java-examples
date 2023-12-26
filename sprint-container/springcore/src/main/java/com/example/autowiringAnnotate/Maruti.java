package com.example.autowiringAnnotate;

public class Maruti {

  private String make;

  public Maruti() {
  }

  public Maruti(String make) {
    this.make = make;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  @Override
  public String toString() {
    return "Maruti [make=" + make + "]";
  }
  
}
