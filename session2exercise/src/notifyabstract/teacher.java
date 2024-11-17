package notifyabstract;

public class teacher extends Person {
	private int phonenumber;
	public teacher(String name, int phonenumber) {
		super(name);
		this.phonenumber=phonenumber;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public void notif() {
		System.out.println("call to "+ getPhonenumber()+ " hello "+ getName());

	}

}
