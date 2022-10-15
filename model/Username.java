package model;

import java.util.ArrayList;

public class Username {

  private String name;
  private ArrayList<String> nameList = new ArrayList<>();

  Username(String name) {
   this.name = name;
   addName(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private void addName(String name) {
    checkDuplicateName(name);
    nameList.add(name);
  }

  public void checkDuplicateName(String name) {
    for (String nameInList : nameList) {
      if(nameInList.contains(name)) {
        throw new Error("The username is already beign used. Try another name.");
      }
    }
  }
}
