package src.view;

import java.util.ArrayList;

import src.model.User;

public class ConsoleUi {
  

  public void registerSuccessMsg(User user) {
    System.out.println( user.getUsername() + " has been registered succesfully");
  }

  public void signInSuccessMsg(String username) {
    System.out.println(username + " has succssesfully signed in");
  }

  public void printUserDatabase(ArrayList<User> userList) {
    
    if(userList.size() == 0) {
      System.out.println("user database is empty");
    } else {
      System.out.println("===Users===");
      for (User user : userList) {
        printOneUser(user);
      }

    }
  }

  public void printOneUser(User user) {
    System.out.println("name: " + user.getUsername());
    System.out.println("password: " + user.getPassword());
    System.out.println("authenticated: " + user.getAuthenticated());
    System.out.println("\n");
  } 

  public void print(String msg) {
    System.out.println("\n");
    System.out.println(msg);
  }

  public void signOutSuccessMsg(String name) {
    System.out.println(name + " has successfully signed out");
  }

}
