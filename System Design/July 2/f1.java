import java.io.*;
import java.util.*;

class Main {
  
  static class Person {
      int age;
      String name;
      
      void sayHi(){
          int age = 200;

          System.out.println(this.name + "[" + age + "] says hi.");
      }
  }
  
//   In heap we store instance and in stack we store reference. (Both stack and heap are in RAM memory)
    
  public static void main(String[] args) throws NumberFormatException, IOException {
      // new keyword creates instance in heap 
      Person p1 = new Person(); // (p1 is reference of new Person() instance) or (p1 is reference to an object.)
      p1.age = 10; // instance variable / data member
      p1.name = "A";

    //   by default "this" keyword/ reference of object is passed while calling sayHi function. "this" belongs to object.
      p1.sayHi();
      
      Person p2 = new Person();
      p2.age = 20;
      p2.name = "B";
      p2.sayHi();
      
    //   Doing this 
      Person p3 = p2;
      p3.sayHi();
      
      p2.name = "C";
      p2.sayHi();
      p3.sayHi();
      
      
  }
}