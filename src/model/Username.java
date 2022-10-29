package src.model;

public class Username {

  private String name;

  public Username(String name) {
   this.name = name;
   checkIfStringIsEmpty(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
 
  public void checkIfStringIsEmpty(String name) {
    if(name.isEmpty() || name.length() < 2) {
      throw new Error("Name must atleast consist of 2 characters");
    }
  }

}
