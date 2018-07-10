package AssignmentShape;

public class Sphere extends ThreeDimensionalShape{
	final double pi = Math.PI;
	private final double radius ;
	
	public double getArea(){
		return 4/3*pi*Math.pow(radius, 3);
	}
	
	public double getVolume(){
		return 4*pi*Math.pow(radius,2);
	}
	public double getRadius() {
		return radius;
	}
	
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "This is Three Dimensional Shape" + "\nType: Sphere " +"\nArea : " + getArea() + " - Volume :" + getVolume();
	}
}
