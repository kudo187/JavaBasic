package AssignmentShape;

public class Cube extends ThreeDimensionalShape{
	private final double a;
	
	public double getArea(){
		return 6*Math.pow(a, 2);
	}
	
	public double getVolume(){
		return Math.pow(a, 3);
	}
	
	public double getA() {
		return a;
	}

	public Cube(double a) {
		super();
		this.a = a;
	}
	
	@Override
	public String toString() {
		return "This is Three Dimensional Shape" + "\nType: Cube " +"\nArea : " + getArea() + " - Volume :" + getVolume();
	}
}
