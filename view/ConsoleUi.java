package view;

import java.util.ArrayList;

import model.User;

public class ConsoleUi {
  

  public void registerSuccessMsg(User user) {
    System.out.println( user.getUsername() + " has been registered succesfully");
  }

  public void signInSuccessMsg() {
    System.out.println("the user is signed in");
  }

  public void printUserDatabase(ArrayList<User> userList) {
    
    if(userList.size() == 0) {
      System.out.println("user database is empty");
    } else {
  
      for (User user : userList) {
        printOneUser(user);
        System.out.println("\n");
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
