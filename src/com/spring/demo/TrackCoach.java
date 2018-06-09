package com.spring.demo;

public class TrackCoach implements Coach {
	
	//define private field for dependency 
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 20 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it:" + this.fortuneService.getFortune();
	}

}
