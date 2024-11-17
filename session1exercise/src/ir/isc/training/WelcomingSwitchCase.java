package ir.isc.training;

public class WelcomingSwitchCase {

	public static void main(String[] args) {
		welcoming();
	}
	public static void welcoming() {
		String name="fatemeh";
		switch (name) {
		case "fatemeh", "mahsa" ->System.out.println("welcome women :)");
		case "iman", "ali" ->System.out.println("welcome men :)");
		default -> System.out.println("you are not our member");
		}
	}
}
