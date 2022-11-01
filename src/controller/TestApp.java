package src.controller;

import src.model.UserDatabase;
import src.view.ConsoleUi;

// maual testing
public class TestApp {

  
  public static void main(String[] args) {
    
    UserDatabase model = new UserDatabase();
    ConsoleUi view = new ConsoleUi();
    SimpleAuth simpleAuth = new SimpleAuth();

    // 1. register a user (works)
    simpleAuth.registerUser("hannah", "password");

    // 2. register a second member (does not work)
    // simpleAuth.registerUser("john doe", "password");
    
    // 3. register someone with the same name
    // simpleAuth.registerUser("hannah", "password");

    // 4. register someone with a short password (works)
    // simpleAuth.registerUser("hannah2", "pass");

    // 5. register someone with a long password (works)
    // simpleAuth.registerUser("hannah2", "123456789123456789123456466");

    // 6. sign in a registered user (works)
    simpleAuth.signIn("hannah", "password");
  
    // 7. sign in a user that doesnt exist (works)
    // simpleAuth.signIn("hannah4", "password");

    // 8. sign in with wrong password (works)
    // simpleAuth.signIn("hannah", "password1234");

    // 9. get current user (works)
    // TODO: will throw java.lang.NullPointerException if object is null/ not signed in
    // view.print("current user");
    // view.printOneUser(simpleAuth.getCurrentUser());

    // 10. signout user
     simpleAuth.signOut();

    //11. get all users (works)
    view.printUserDatabase(simpleAuth.getAllUsers());

  }

}
