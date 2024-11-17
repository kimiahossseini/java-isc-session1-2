package notifyabstractclass;

public class MainEmployee {

	public static void main(String[] args) {
		Manager jhon = new Manager("Johon Nash", "Chigago",100);
		TopManager paul = new TopManager("Paul Bill", "Newyork",100);
	
		jhon.sendPaymentSms();
		paul.sendPaymentSms();

	}

}
