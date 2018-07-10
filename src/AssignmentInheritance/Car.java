package AssignmentInheritance;

public class Car {
	private int speed;
	private double regularPrice;
	private String color;
	public double getSalePrice(){
		return regularPrice;
	}
	public Car() {
		super();
	}
	public Car(int speed, double regularPrice, String color) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getRegularPrice() {
		return regularPrice;
	}
	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	};
	@Override
	public String toString() {
		return "Giá xe: " + getSalePrice();
	}
}
