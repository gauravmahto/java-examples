package com.example.collections;

import java.util.List;
import java.util.Set;

public class Emp {

  private String name;

  private List<String> phones;

  private Set<String> secondaryPhones;

  public Emp() {
    super();
  }

  public Emp(String name, List<String> phones) {
    super();
    this.name = name;
    this.phones = phones;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getPhones() {
    return phones;
  }

  public void setPhones(List<String> phones) {
    this.phones = phones;
  }

  public Set<String> getSecondaryPhones() {
    return secondaryPhones;
  }

  public void setSecondaryPhones(Set<String> secondaryPhones) {
    this.secondaryPhones = secondaryPhones;
  }

  @Override
  public String toString() {
    return "Emp [name=" + name + ", phones=" + phones + ", secondaryPhones=" + secondaryPhones + "]";
  }

}
