import java.io.*;
import java.util.*;

class Main {
  
  static class BankAccount {
      int anum;
      int money;
      static int roi;

      void announce(){
        System.out.println(this.anum + ", " + this.money + ", " + this.roi);
      }
  }
  
  
  // static data member belong to class
  // They are not stored in instance while creating instance of class.
  
  public static void main(String[] args) throws NumberFormatException, IOException {
      BankAccount a1 = new BankAccount(); // a1 will put only those data members and functions in heap which are non static
      a1.anum = 10;
      a1.money = 100;
      
      a1.roi = 4; // Bad Practice : It will give warning bcz "roi" is property of class not object. So it should have been "BankAccount.roi"

      a1.announce();

      BankAccount a2 = new BankAccount();
      a2.anum = 11;
      a2.money = 110;
      a2.roi = 5; // This will change "roi" variable of class BankAccount. So a1 object's "roi" will also change.
    
      a2.announce();
      a1.announce();
  }


}