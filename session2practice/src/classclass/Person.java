package classclass;

public class Person {
	public Person(String name, int age, Adress address, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.car = car;
	}
	private String name;
	private int age;

	private Adress address; // A Person without address is valid but not complete (Has-A aggregation)
	private Car car; 		 // A Person without car is quite OK ( The person and car are association )

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Adress getAddress() {
		return address;
	}
	public void setAddress(Adress address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", car=" + car + "]";
	}
	

}
