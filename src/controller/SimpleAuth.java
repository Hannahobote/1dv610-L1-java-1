package src.controller;

import src.model.Password;
import src.model.User;
import src.model.UserDatabase;
import src.model.Username;
import src.model.UsernameDatabase;
import src.view.ConsoleUi;

public class SimpleAuth {

  private UserDatabase userDatabase;
  private UsernameDatabase nameList = new UsernameDatabase();
  private ConsoleUi view;
  private User currentUser;

  /**
   * Constructor.
   *
   * @param userDatabase this is the model.
   * @param view this is the user interface.
   */
  SimpleAuth(UserDatabase userDatabase, ConsoleUi view) {
    this.userDatabase = userDatabase;
    this.view = view;
  }

  public void registerUser(String newUsername, String newPassword) {
    Username username = new Username(newUsername);
    Password password = new Password(newPassword);

    nameList.addUsername(newUsername);
    User user = new User(username, password);
  
    userDatabase.addUsers(user);
    view.registerSuccessMsg(user);
  }

  public void signIn(String username, String password) {

    for (User user : userDatabase.getAllUsers()) {
      if (!user.getUsername().contains(username)) {
        throw new Error("user Does not exist");
      }

      if (user.getUsername().contains(username) && user.getPassword().contains(password)) {
        user.setAuthenticated(true);
        setCurrentUser(user);
        view.signInSuccessMsg();
      } else {
        throw new Error("username or password is incorrect. Try again.");
      }
    }
  }

  public void signOut() {
    view.signOutSuccessMsg(getCurrentUser().getUsername());
    currentUser.setAuthenticated(false);
    setCurrentUser(null);
  }

  private void setCurrentUser(User currentUser) {
    this.currentUser = currentUser;
  }

  public User getCurrentUser() {
    return currentUser;
  }
}
