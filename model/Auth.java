package model;

import java.util.ArrayList;

public class Auth {
  // TODO: make a user database?
  private ArrayList<User> userList = new ArrayList<>();
  
  Auth() {

  }

  public void addUsers(User user) {
    userList.add(user);
  }

  public void registerUser (Username username, Password password) {
    User user = new User(username, password);
    addUsers(user);
  }

  SignIn(String username, String password) {
    // loop user database

    // check if username is correct - Username.java
    // check if password is coreect - Passwors.java
  }

  // users database
  // register
  // sign in
  // sign out
  // get current signin user
  // user logged in
}
