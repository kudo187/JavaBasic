package AssignmentShape;

public class Circle extends TwoDimensionalShape{
	final double pi = Math.PI;
	@Override
	public String toString() { 
		return "This is Two Dimensional Shape" + "\nType: Circle " +"\nArea : " + getArea();
	}

	private final double radius ;
	
	public double getArea(){
		return pi * Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	};
}
