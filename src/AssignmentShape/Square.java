package AssignmentShape;

public class Square extends TwoDimensionalShape {
	private final double width;
	
	public Square(double width) {
		super();
		this.width = width;
	}

	public double getArea(){
		return width*width;
	}

	public double getWidth() {
		return width;
	}
	@Override
	public String toString() {
		return "This is Two Dimensional Shape" + "\nType: Square " +"\nArea : " + getArea();
	}
}
