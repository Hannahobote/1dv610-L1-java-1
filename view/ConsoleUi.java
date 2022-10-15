package view;

import model.User;

public class ConsoleUi {
  

  public void registerSuccessMsg(User user) {
    System.out.println( user.getUsername() + " user had been registered succesfully");
  }

  public void signInSuccessMsg() {
    System.out.println("the user is signed in");
  }

  public void printUserDatabase() {

  }
}
