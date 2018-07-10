package AssignmentInheritance;

public class Truck extends Car {
	int weight;
	
	public double getSalePrice() {
		if (weight > 2000) {
			return getRegularPrice() - getRegularPrice()*0.1;			
		}
		else {
			return weight - weight*0.2;
		}
	}

	public Truck(int weight, int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
		// TODO Auto-generated constructor stub
		this.weight = weight;
	}

	public Truck() {
		super();
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Giá xe Truck: " + getSalePrice();
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
