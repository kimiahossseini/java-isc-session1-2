package innerclass;

import innerclass.Building.Room;

public class Buildingmain {

	public static void main(String[] args) {
		Building hospital = new Building();
		hospital.address="Tajrish Sq.";
		Room surgeryRoom = hospital.createRoom("red");
		surgeryRoom.isReady();//Set breakpoint see $ in inner-class see this$0 and building

	}

}
