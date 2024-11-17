package notifyabstractclass;

public class TopManager extends Employee {

	public TopManager(String name, String address, int salary) {
		super(name, address, salary);
		
	}

	@Override
	public double computePay() {
		return getSalary() * 1.4;
	}

}
