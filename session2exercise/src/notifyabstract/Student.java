package notifyabstract;

public class Student extends Person {
	private int number;
	public Student(String name, int number) {
		super(name);
		this.number = number;
	}
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public void notif() {
		System.out.println("send sms to  "+ getNumber()+ " hi "+ getName());

	}


	

}
