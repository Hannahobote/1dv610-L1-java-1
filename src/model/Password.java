package src.model;

import java.util.ArrayList;

public class Password {
  
  private String password;
  private ArrayList<String> passwordList = new ArrayList<>();

  public Password(String password) {
   this.password = password;
   addPassword(password);
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  private void addPassword(String password) {
    checkpasswordLength();
    passwordList.add(password);
  }

  public void checkpasswordLength() {
    if(this.password.length() < 6) {
      throw new Error("password must ast least be 6 characters");
    }

    if(this.password.length() > 20) {
      throw new Error("password cannot be more than 20 characters");
    }
  }
}
