package AssignmentInheritance;

public class Sedan extends Car {
	private int length;
	public double getSalePrice(){
		if (length > 20) {
			return getRegularPrice() - getRegularPrice()*0.05;
		}
		else
		{
			return getRegularPrice() - getRegularPrice()*0.1;
		}
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		// TODO Auto-generated constructor stub
		this.length = length;
	}
	public Sedan() {
		super();
	};
	
	@Override
	public String toString() {
		return "Giá xe Sedan: " + getSalePrice();
	}
}
