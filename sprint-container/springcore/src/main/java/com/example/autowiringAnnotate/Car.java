package com.example.autowiringAnnotate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

  @Autowired
  @Qualifier("marutiTwo")
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
