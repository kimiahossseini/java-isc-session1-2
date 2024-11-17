package ir.isc.training;

public class GradingSwitchCase {

	public static void main(String[] args) {
		grading();
	}
	public static void grading() {
		int Score=80;
		switch (Score/10) {
		case 10:
			System.out.println("your grade is A+");
			break;
		case 9:
			System.out.println("your grade is A");
			break;
		case 8:
			System.out.println("your grade is B");
			break;
		case 7:
			System.out.println("your grade is C");
			break;
		case 6:
			System.out.println("your grade is D");
			break;
		default:
			System.out.println("your grade is F");
			break;
		}
	}
}
