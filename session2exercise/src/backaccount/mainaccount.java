package backaccount;

public class mainaccount {

	public static void main(String[] args) {
		account user=new account(200,"mirdamad" ,true, null);
		user.withdraw(150);
		user.printinfo();

	}

}
