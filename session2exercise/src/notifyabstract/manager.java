package notifyabstract;

public class manager extends Person {
	private String address;
	public manager(String name, String address) {
		super(name);
		this.address=address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void notif() {
		System.out.println("go to this address "+ getAddress()+ " hello "+ getName());

	}

}
