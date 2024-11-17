package ir.isc.training;

public class GradingMaximum {

	public static void main(String[] args) {
		int[] scores = {10,90,100,70,30,90,12,45,66,54};
		String[] grades = new String[scores.length];
		grading(scores,grades);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
		}
		max(scores);
	}
	public static void grading(int[] scores, String[] grades) {
		for (int i = 0; i < scores.length; i++) {
			if (scores[i]==100)
				grades[i]="A+";
			else if(scores[i]>=90)
				grades[i]="A";
			else if(scores[i]>=80)
				grades[i]="B";
			else if(scores[i]>=70)
				grades[i]="C";
			else if(scores[i]>=60)
				grades[i]="D";
		   else 
			   grades[i]="D";
			}
		}
	public static void max(int[] scores) {
		int max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max)
				max = scores[i];
		}
		System.out.println("maximum score is "+max);
		
		
		
	}
}
