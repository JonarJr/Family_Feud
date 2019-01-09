package game;

import java.util.ArrayList;

public class Question {
	
	private String question;
	private int multiplier = 1;
	private ArrayList<Answer> answers;
	
	public Question(String question) {
		this.question = question;
		this.answers = new ArrayList<Answer>();
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public int getMultiplier() {
		return multiplier;
	}
	
	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}
	
	public void addAnswer(String answerString, int value) {
		answers.add(new Answer(answerString, value));
	}
	
	public String toString() {
		return getQuestion();
	}
}
