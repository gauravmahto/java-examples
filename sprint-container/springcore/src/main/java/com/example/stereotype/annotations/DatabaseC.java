package com.example.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbInstance")
public class DatabaseC {

  private String url;

  
  public DatabaseC(@Value("${url:db://local}") String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "DatabaseC [url=" + url + "]";
  }

}
