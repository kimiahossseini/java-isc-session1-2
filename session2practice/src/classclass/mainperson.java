package classclass;

public class mainperson {

		public static void main(String[] args) {
			
			//This is called Aggregation 
			
			//The Person and Address objects are different but Person with no Address is somehow useless.
			Adress staffAddress = new Adress("Iran", "Tehran", "41°24'12.2N 2°10'26.5E.");
			
			//Person and Car are different. Means the life cycles of the objects aren’t tied.
			Car golf = new Car("Volkswagen", "Golf", "green");
			
			
			Person staff = new Person("Alireza", 48,staffAddress, golf); //Describe the default constructor
			System.out.println(staff);
			
		}

	}


