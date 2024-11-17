package shapegeneric;

public class Circle extends Shape {
	int r;
	public Circle(int r) {
		this.r=r;
	}

	@Override
	public double area() {
		return Math.PI * r* r;
	}

}
