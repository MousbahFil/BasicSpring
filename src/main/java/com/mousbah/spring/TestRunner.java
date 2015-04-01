package com.mousbah.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRunner {
   public static void main(String[] args) {
      @SuppressWarnings("resource")
	ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
      Person person =  (Person) context.getBean("person");
      person.printUsingReflection();
      
      Course course=(Course) context.getBean("course");
      System.out.println(course.getDesription());
   }
} 