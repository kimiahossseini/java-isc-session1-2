package shapegeneric;

public class mainshpae {

	public static void main(String[] args) {
		Shape shape1=new Circle(20);
		System.out.println("area circle is:"+shape1.area());
		Shape shape2=new squar(3,5);
		System.out.println("area squar is:"+shape2.area());
		
		squar[] squares={new squar(3,5), new squar(5,6), new squar(5,2)};
		double totalsquararea=Boxshape.totalareas(squares);
		System.out.println("the tota squars area is " + totalsquararea);
		
		Circle[] circles={new Circle(3), new Circle(5), new Circle(5)};
		double totalcirclearea=Boxshape.totalareas(circles);
		System.out.println("the tota circle area is " +(int)totalcirclearea);
	}

}
