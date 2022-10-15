package controller;

import model.UserDatabase;
import view.ConsoleUi;

// maual testing
public class TestApp {

  public static void main(String[] args) {
    UserDatabase model = new UserDatabase();
    ConsoleUi view = new ConsoleUi();
    SimpleAuth simpleAuth = new SimpleAuth(model, view);

    // register a user
    simpleAuth.registerUser("hannah", "password");
    // register someone with the same name
    simpleAuth.registerUser("hannah", "password");

    // register someone with a short password (works)
    // simpleAuth.registerUser("hannah2", "pass");

    // register someone with a long password (works)
    // simpleAuth.registerUser("hannah2", "123456789123456789123456466");

    // sign in a registered user (?)
    // simpleAuth.signIn("hannah", "password");

    // sign in a user that doesnt exist (works)
    // simpleAuth.signIn("hannah4", "password");

    // get current user
    // view.printOneUser(simpleAuth.getCurrentUser());

    // signout user
    // simpleAuth.signOut();

    // get all users (works)
    view.printUserDatabase(simpleAuth.getAllUsers());

  }
}
