package com.example.autowiringXml;

public class Car {

  private Maruti maruti;

  public Car() {
  }

  public Car(Maruti maruti) {
    this.maruti = maruti;
  }

  public Maruti getMaruti() {
    return maruti;
  }

  public void setMaruti(Maruti maruti) {
    this.maruti = maruti;
  }

  @Override
  public String toString() {
    return "Car [maruti=" + maruti + "]";
  }
  
}
