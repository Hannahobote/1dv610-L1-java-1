package model;


public class User {

  private Username username;
  private Password password;
  private Boolean authenticated;

  public User(Username username, Password password) {
    this.username  = username;
    this.password = password;
    this.authenticated = false;
  }

  public void setUsername(Username username) {
    this.username = username;
  }

  public Username getUsername() {
    return username;
  }

  public void setPassword(Password password) {
    this.password = password;
  }

  public Password getPassword() {
    return password;
  }

  public Boolean getAuthenticated() {
    return authenticated;
  }

  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }
}