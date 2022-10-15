package controller;
import java.util.ArrayList;

import model.Password;
import model.User;
import model.UserDatabase;
import model.Username;
import model.UsernameDatabase;
import view.ConsoleUi;

public class SimpleAuth {

  private UserDatabase userDatabase;
  private UsernameDatabase nameList = new UsernameDatabase();
  private ConsoleUi view;

  // user is the model, and console ui is the view
  SimpleAuth(UserDatabase userDatabase, ConsoleUi view) {
    this.userDatabase = userDatabase;
    this.view = view;
  }

  private User currentUser;
  
  public void registerUser (String newUsername, String newPassword) {
    // create user object
    Username username = new Username(newUsername);
    Password password = new Password(newPassword);
    
    // add username to username db and run erro checking
    nameList.addUsername(newUsername);
    User user = new User(username, password);
    // add to database
    userDatabase.addUsers(user);
    view.registerSuccessMsg(user);
  }


  public void signIn(String username, String password) {
    // loop user database
    for (User user : userDatabase.getAllUsers()) {
      
      // check if username is correct - Username.java
      if(!user.getUsername().contains(username)) {
        throw new Error("user Does not exist") ;
      }
      
      // check if password is coreect - Passwors.java
      if(user.getUsername().contains(username) && user.getPassword().contains(password)) {
        user.setAuthenticated(true);
        // set the current logged in user
        setCurrentUser(user);
        view.signInSuccessMsg();
      } else {
        throw new Error("username or password is incorrect. Try again.") ;
      }
    }
  }

  public void signOut() {
    // setting autheticated to false wil "sign out" the user.
    getCurrentUser().setAuthenticated(false);
    setCurrentUser(null);
  }

  private void setCurrentUser(User currentUser) {
    this.currentUser = currentUser;
  }

  public User getCurrentUser() {
    return currentUser;
  }

  public ArrayList<User> getAllUsers() {
    return userDatabase.getAllUsers();
  }
}
