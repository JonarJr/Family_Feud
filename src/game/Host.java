package game;

import java.util.concurrent.ThreadLocalRandom;

public class Host implements Rules {
	
	private String name;
	
	public Host() {
		this.name = hostName;
	}
	
	public void introduction(Family f1, Family f2) {
		System.out.println("Welcome to Family Feud! I'm your man, " + name + ". We got a good one today! ");
		
		if(f1.getStreak() > 0) {
			System.out.println("Returning for their " + streakDays[f1.getStreak()] + " day, from " 
								+ f1.getLocation() + ", it's the " + f1.getName() + " family!");
		} else {
			System.out.println("From " + f1.getLocation() + ", it's the " + f1.getName() + " family!");
		}
		
		if(f2.getStreak() > 0) {
			System.out.println("...ANNNND, returning for their " + streakDays[f2.getStreak()] + " day, from "
								+ f2.getLocation() + ", it's the " + f2.getName() + " family!");
		} else {
			System.out.println("From " + f2.getLocation() + ", it's the " + f2.getName() + " family!");
		}
		
		System.out.println("Give me " + f1.currentMember() + ", give me " + f2.currentMember() + "!\n");
	}
	
	public void react(String response) {
		
	}
	
	public void questionPrompt(int answers, String demographic, String question) {
		System.out.println(answers + " answers on the board.");
		System.out.println("We asked 100 " + demographic + ": " + question);
	}
	
	public void continuedPrompt(int answer, String member, String question, int strikes) {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
		switch(randomNum) {
			case 0:
				System.out.println("Alright, " + member + ", what's your answer?");
			case 1:
				System.out.print(member + "let me repeat the question for you again.");
			case 2:
				if(strikes == 2) {
					System.out.println(member + ", you have 2 strikes. If you answer incorrectly, the other family can steal.");
				} else {
					System.out.println(member + ", 1 strike on the board. What is your answer?");
				}
		}
				
	}
}
