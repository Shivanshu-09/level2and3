// When we do in console "java Main.class" to run a file, Java first identifies the class which contains "main" function and that class/ container becomes entry point of program

import java.io.*;
import java.util.*;

class Main {
  
  static class Point {
    int x;
    int y;
  }

  static class Rectangle {
    Point tl;
    Point br;
  }
  
  // object = instance :: And every object has address of its class
  // instance will always be in heap but from this example reference can be in both stack or heap.
  public static void main(String[] args) throws NumberFormatException, IOException {
      Rectangle r = new Rectangle(); // instance, ref
      r.tl = new Point(); // inst, ref
      r.tl.x = 2;
      r.tl.y = 6;
      // In this r.tl is a reference stored in heap.

      r.br = new Point(); // inst, ref
      r.br.x = 6;
      r.br.y = 1;

      
      
  }

  // After the end of main function all references/ data values from stack are removed
  // And for heap, garbage collector module frees up space and empties heap memory.
}