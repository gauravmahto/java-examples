package com.example.autowiringXml;

public class Vehicle {

  private Car car;

  public Vehicle() {
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    System.out.println("Vehicle Setter");
    this.car = car;
  }

  public Vehicle(Car car) {
    System.out.println("Vehicle CTOR");
    this.car = car;
  }

  @Override
  public String toString() {
    return "Vehicle [car=" + car + "]";
  }
  
}
