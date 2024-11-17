package ir.isc.training;

public class methoding {

		public static void main(String[] args) {

			int[] scores = {100,90,100,70,30,90,12,45,66,54};
			
			char[] grades = new char[scores.length];


			// Get grades
			getGrades(scores, grades);

			// Display results
			for (int i = 0; i < scores.length; i++) {
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
			}
		}
		
		/** Method getGrade assigns grades based on grading scheme */
		public static void getGrades(int[] scores, char[] grades) {
			int best = max(scores);
			for (int i = 0; i < scores.length; i++) {
				if (scores[i] >= best - 10)
					grades[i] = 'A';
				else if (scores[i] >= best - 20)
					grades[i] = 'B';
				else if (scores[i] >= best - 30)
					grades[i] = 'C';
				else if (scores[i] >= best - 40)
					grades[i] = 'D';
				else
					grades[i] = 'F';
			}
		}
		
		/** Method max returns the is highest score */
		public static int max(int[] array) {
			int max = array[0];
			for (int i = 1; i < array.length; i++) {
				if (array[i] > max)
					max = array[i];
			}
			return max;
		}

	

}
