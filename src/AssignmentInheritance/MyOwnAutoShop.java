package AssignmentInheritance;

import java.util.ArrayList;

import Assignment2.Card;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		Sedan sedan1 = new Sedan(2000,2000,"Green",30);
		Ford ford1  = new Ford(1000,3204.4,"Red",2008,20);
		Ford ford2  = new Ford(3000,5005.3,"Orange",2005,10);
		Car car = new Car(1000,202.2,"Blue");
		ArrayList<Car> arrCar = new ArrayList<>();
		arrCar.add(sedan1);
		arrCar.add(ford1);
		arrCar.add(ford2);
		arrCar.add(car);
		System.out.println("<------------------Giá bán của các loại xe---------------->");
		for (Car carValue : arrCar) {
			System.out.println(carValue.toString());
		}
	}
}
