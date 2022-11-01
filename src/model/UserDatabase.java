package src.model;

import java.util.ArrayList;

public class UserDatabase {
  private ArrayList<User> userList = new ArrayList<>();

  public void addUsers(User user) {
    userList.add(user);
  }

 public ArrayList<User> getAllUsers() {
  ArrayList<User> copy = new ArrayList<>();
  copy.addAll(userList);
  return copy;
  }

  public User getOneUser(int index) {
    return userList.get(index);
  }

}
