package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
    MyDependentClass myDependentClass = context.getBean(MyDependentClass.class);
    myDependentClass.doTheThing();
  }
}
