package shapegeneric;

public class Boxshape{

	public static<T extends Shape> double totalareas(T[] shapess) {
		double totalArea = 0;
	     for (T s : shapess) {
	         totalArea += s.area();
	     }
	     return totalArea;
		
		
	}

	

}
