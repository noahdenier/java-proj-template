package org.example;

public class MyDependentClass {
  private final MyClass myClass;

  public MyDependentClass(MyClass myClass) {
    this.myClass = myClass;
  }

  public void doTheThing() {
    String printMe = "Hello World!";
    myClass.doTheThing(printMe);
  }
}
