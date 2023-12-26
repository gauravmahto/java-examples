package com.example.ctor;

public class PersonCode {
  private int code;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public PersonCode(int code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return Integer.toString(code);
  }
}
