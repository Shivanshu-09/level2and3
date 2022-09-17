import java.io.*;
import java.util.*;

class Main {
  
  static class Person {
      int age;
      String name;
      
      void sayHi(){
          System.out.println(this.name + "[" + this.age + "] says hi.");
      }
  }
  
  
    
  public static void main(String[] args) throws NumberFormatException, IOException {
      
      Person p1 = new Person();
      p1.age = 10;
      p1.name = "A";
      p1.sayHi();
      
      Person p2 = new Person();
      p2.age = 20;
      p2.name = "B";
      p2.sayHi();
      
      swap(p1, p2);

      p1.sayHi();
      p2.sayHi();
      
      
  }

  // swap will not happen. Once the function is executed fully then it will come out of stack, So p1 and p2 are still the same
  static void swap(Person a, Person b){
    Person t = a;
    a = b;
    b = t;
  }
}