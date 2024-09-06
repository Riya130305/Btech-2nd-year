//Write a program to demonstrate method overloading in a class Calculator. Create 
//multiple add methods to handle different types of parameters (e.g., int, double, etc.).

class Calculator{
    
  void add(int a,int b){//method
    System.out.println(a+b);
    }
    
  void add(float a, float b){
    System.out.println(a+b);
    }
  }

public class MainClass {
  public static void main(String[] args) {
    Calculator cal = new Calculator(); // Object creation
    cal.add(12,89);
    cal.add(12.2f,34.0f);// Calling a method on object
  }
}
