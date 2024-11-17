package notifyabstract;

public abstract class Person {
	private String name;
	public Person(String name) {
		super();
		this.name = name;
	}
	
	//Setter and getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//abstract method
	
	public abstract void notif();
	
	public void wakeup() {
		System.out.println("hello "+ getName()+ " please wakeup ");
	}
	
}
