package game;

public class Tester {
	public static void main(String[] args) {
		String[] f1Members = {"Jason", "Jonas", "Jared", "Indra", "Julia"};
		String[] f2Members = {"Susan", "Bill", "Bob", "Sally", "Chris"};
		Family f1 = new Family("Tjahjadi", f1Members, "Rego Park, New York");
		Family f2 = new Family("Williamson", f2Members, "San Diego, California");
		Host host = new Host();
		host.introduction(f1, f2);
		host.questionPrompt(4, "men", "What's that smell?");
	}
}
