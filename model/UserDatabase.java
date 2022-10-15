package model;

import java.util.ArrayList;

public class UserDatabase {
  private ArrayList<User> userList = new ArrayList<>();

  public void addUsers(User user) {
    userList.add(user);
  }

 public ArrayList<User> getAllUsers() {
  // TODO: retun copy of userlist.
   return userList;
  }

  public User getOneUser(int index) {
    return userList.get(index);
  }

}
