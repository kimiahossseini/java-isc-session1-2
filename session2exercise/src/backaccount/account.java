package backaccount;

import java.time.LocalDateTime;

public class account {
	private int balance;
	private String branch;
	private boolean lock;
	private LocalDateTime latsttransaction;
	//constructors for all
	public account(int balance, String branch, boolean lock, LocalDateTime latsttransaction) {
		super();
		this.balance = balance;
		this.branch = branch;
		this.lock = lock;
		this.latsttransaction = latsttransaction;
	}
	
	//constructor balance
	public account(int balance) {
		super();
		this.balance = balance;
	}
	//constructor balance
	public account(int balance, String branch) {
		super();
		this.balance = balance;
		this.branch = branch;
	}
	
	//setters and getters
	public boolean isLock() {
		return lock;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public LocalDateTime getLatsttransaction() {
		return latsttransaction;
	}
	public void setLatsttransaction(LocalDateTime latsttransaction) {
		this.latsttransaction = latsttransaction;
	}
	//method for withdraw
	public void withdraw(int n) {
		if (n>0 && n<=getBalance()&& isLock()==true) {
			setBalance(getBalance()-n);
			setLatsttransaction(LocalDateTime.now());
			System.out.println("transaction is successful "+ "new balance is " + getBalance());
		} else {
			System.out.println("your balance is not enough !");
		}
	}
	//method for printinfo
	public void printinfo() {
		System.out.println("your balance is: "+ getBalance());
		System.out.println("your branch is "+ branch);
		System.out.println("your last transaction on"+ getLatsttransaction());
		if (isLock()==true) {
			System.out.println("your account is active");
		} else {
			System.out.println("your account is locked");
		}

		
	}


}
