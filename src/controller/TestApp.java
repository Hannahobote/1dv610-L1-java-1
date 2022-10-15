package src.controller;

import src.model.UserDatabase;
import src.view.ConsoleUi;

// maual testing
public class TestApp {

  public static void main(String[] args) {
    UserDatabase model = new UserDatabase();
    ConsoleUi view = new ConsoleUi();
    SimpleAuth simpleAuth = new SimpleAuth(model, view);

    // register a user
    simpleAuth.registerUser("hannah", "password");

     // register a second member (works)
     simpleAuth.registerUser("john doe", "password");
    
    // register someone with the same name
    // simpleAuth.registerUser("hannah", "password");

    // register someone with a short password (works)
    // simpleAuth.registerUser("hannah2", "pass");

    // register someone with a long password (works)
    // simpleAuth.registerUser("hannah2", "123456789123456789123456466");

    // sign in a registered user (works)
    // simpleAuth.signIn("hannah", "password");

    // sign in a user that doesnt exist (works)
    // simpleAuth.signIn("hannah4", "password");

    // sign in with wrong password (works)
    // simpleAuth.signIn("hannah", "password1234");

    // get current user (works)
    // TODO: will throw java.lang.NullPointerException if object is null/ not signed in
    // view.print("current user");
    // view.printOneUser(simpleAuth.getCurrentUser());

    // signout user
    // simpleAuth.signOut();

    // get all users (works)
    view.printUserDatabase(simpleAuth.getAllUsers());

  }
}
