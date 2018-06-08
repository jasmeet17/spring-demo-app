package com.spring.demo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Create a construction in the class for injections
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 40 minutes Batting.";
	}
	
}
