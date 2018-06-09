package com.spring.demo;

public class CricketCoach implements Coach {
	
	//define private field for dependency 
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Inside Cricket constructor.");
	}
	
	//dependency injection using setter method	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Play Cricket 60 mins";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket:" + this.fortuneService.getFortune();
	}

}
