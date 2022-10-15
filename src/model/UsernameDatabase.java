package src.model;
import java.util.ArrayList;

public class UsernameDatabase {

  private ArrayList<String> nameList = new ArrayList<>();

  public void addUsername(String name) {
    checkDuplicateName(name);
    nameList.add(name);
  }

  public void checkDuplicateName(String nameToCheck) {
    // if list is not empty, check for duplicates
    if(nameList.size() != 0) {
      // loop through list
      for (String name : nameList) {
        // check if name exist
        if(name.contains(nameToCheck)) {
          throw new Error("The username is already beign used. Try another name.");
        }
      }
    } 
  }
}
