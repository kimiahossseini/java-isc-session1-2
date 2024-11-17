package shapegeneric;

public class squar extends Shape {
	int l;
	int d;
	public squar(int l, int d) {
		super();
		this.l = l;
		this.d = d;
	}

	@Override
	public double area() {
		return l*d;
	}

}
