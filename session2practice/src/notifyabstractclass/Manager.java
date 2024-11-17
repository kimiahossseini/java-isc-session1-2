package notifyabstractclass;

public class Manager extends Employee {
	
	public Manager(String name, String address, int salary) {
		super(name, address, salary);
		
	}

	@Override
	public double computePay() {
		return getSalary() * 1.2;
		
	}

}
