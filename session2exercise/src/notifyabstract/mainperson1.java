package notifyabstract;

import java.util.Scanner;
//get name and output
public class mainperson1 {

	public static void main(String[] args) {
		System.out.println("enter student's name: ");
		Scanner namme=new Scanner(System.in);	
		System.out.println("enter his/her number: ");
		Scanner numberrr=new Scanner(System.in);
		String namee=namme.next();
		int numberr=numberrr.nextInt();
		Student student=new Student(namee,numberr);
		student.notif();
		student.wakeup();

	}

}
