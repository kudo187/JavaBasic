package AssignmentShape;

public class Tetrahedron extends ThreeDimensionalShape{
	private final double a,b,c,h;
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getH() {
		return h;
	}

	public Tetrahedron(double a, double b, double c, double h) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}

	public double getArea(){
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
	public double getVolume(){
		return 1/3*getArea()*h;
	}
	@Override
	public String toString() {
		return "This is Two Dimensional Shape" + "\nType: Tetrarhedron " +"\nArea : " + getArea() + " - Volume :" + getVolume();
	}
}
