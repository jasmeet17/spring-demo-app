package com.spring.demo;

public class CricketCoach implements Coach {
	
	//define private field for dependency 
	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Play Cricket 60 mins";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
