package game;

public class Family implements Rules {
	
	private String familyName;
	private String[] members = new String[maxMembers];
	private String location;
	private int current, score, streak, money = 0;
	private boolean wonPrevious = false;
	
	public Family(String familyName, String[] members, String location) {
		this.familyName = familyName;
		this.location = location;
		for(int i = 0; i < members.length; i++) {
			this.members[i] = members[i];
		}
	}
	
	public String currentMember() {
		String currentMember = members[current];
		current = (current + 1) % maxMembers;
		return currentMember;
	}
	
	public boolean won() {
		if(score > requiredScore) {
			streak++;
			wonPrevious = true;
			return true;
		}
		return false;
	}
	
	public void lost() {
		wonPrevious = false;
		streak = 0;
	}
	
	public void resetForNextGame() {
		
	}
	
	public void resetAllProgress() {
		
	}
	
	public String getName() {
		return familyName;
	}
	
	public int getScore() {
		return score;
	}
	
	public int getStreak() {
		return streak;
	}
	
	public int getMoney() {
		return money;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void addScore(int score) {
		this.score += score;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	
	public String toString() {
		return familyName;
	}
}
