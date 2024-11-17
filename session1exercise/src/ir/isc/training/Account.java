package ir.isc.training;
import java.lang.reflect.Field;
public class Account {
	private int balance;
	private String branch;
	private boolean status;
	private int lasttransaction;
	
//creating constructors just for balance
	public Account(int balance) {
		super();
		this.balance = balance;
	}
//creating constructors just for balance and branch
	public Account(int balance, String branch) {
		super();
		this.balance = balance;
		this.branch = branch;
	}
//creating constructors for all of the properties
	public Account(int balance, String branch, boolean status, int lasttransaction) {
		super();
		this.balance = balance;
		this.branch = branch;
		this.status = status;
		this.lasttransaction = lasttransaction;
	}
	
	
	public class PropertyPrinter {
	    public static void printProperties(Object obj) {
	        Class<?> objClass = obj.getClass();
	        Field[] fields = objClass.getDeclaredFields();

	        System.out.println("Properties of " + objClass.getSimpleName() + ":");
	        for (Field field : fields) {
	            field.setAccessible(true); // Allows access to private fields
	            try {
	                Object value = field.get(obj); // Get the value of the field
	                System.out.println(field.getName() + ": " + value);
	            } catch (IllegalAccessException e) {
	                System.out.println("Could not access field: " + field.getName());
	            }
	        }
	    }
	}
	

}	

	

