package notifyabstract;

public class mainperson2 {

	public static void main(String[] args) {
		Student user1=new Student("kimia", 225555);
		user1.notif();
		user1.wakeup();
		teacher user2=new teacher("mashhadi",55252);
		user2.notif();
		user2.wakeup();
		manager user3=new manager("alirezaei", "flat4");
		user3.notif();
		user3.wakeup();
		
	}

}
