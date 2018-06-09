package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach criCoach = context.getBean("myCricketCoach", Coach.class);
		Coach baseBallCoach = context.getBean("myBaseballCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(criCoach.getDailyWorkout());
		System.out.println(baseBallCoach.getDailyWorkout());
		System.out.println(baseBallCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
