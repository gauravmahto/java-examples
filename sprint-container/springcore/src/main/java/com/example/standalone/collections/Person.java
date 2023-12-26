package com.example.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
  
  private List<String> friends;
  private Map<String, Integer> friendsMap;
  private Properties properties;

  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }

  public Map<String, Integer> getFriendsMap() {
    return friendsMap;
  }

  public void setFriendsMap(Map<String, Integer> friendsMap) {
    this.friendsMap = friendsMap;
  }

  public List<String> getFriends() {
    return friends;
  }

  public void setFriends(List<String> friends) {
    this.friends = friends;
  }

  @Override
  public String toString() {
    return "Person [friends=" + friends + ", friendsMap=" + friendsMap + ", properties=" + properties + "]";
  }

}
