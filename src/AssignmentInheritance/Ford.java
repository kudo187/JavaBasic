package AssignmentInheritance;

public class Ford extends Car {
	private int year;
	private int manufacturerDiscount;
	
	public double getSalePrice() {
		return getRegularPrice() - getRegularPrice()*manufacturerDiscount/100;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Ford() {
		super();
	}

	public Ford(int speed, double regularPrice, String color,int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}

	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	@Override
	public String toString() {
		return "Giá xe Ford: " + getSalePrice();
	}
}
