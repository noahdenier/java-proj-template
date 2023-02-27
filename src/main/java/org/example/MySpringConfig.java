package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfig {
  @Bean
  public MyClass myClass() {
    return new MyClassImpl();
  }
  @Bean
  public MyDependentClass myDependentClass(MyClass myClass) {
    return new MyDependentClass(myClass);
  }
}
