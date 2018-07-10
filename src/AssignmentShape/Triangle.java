package AssignmentShape;

public class Triangle extends TwoDimensionalShape {
	private final double a, b, c;
	public Triangle() {
        this(1,1,1);
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
    @Override
	public String toString() {
		return "This is Two Dimensional Shape" + "\nType: Triangle " +"\nArea : " + getArea();
	}
}
