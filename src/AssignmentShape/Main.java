package AssignmentShape;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape square = new Square(4.5);
		Shape triangle = new Triangle(5,4,7);
		Shape cube = new Cube(5);
		Shape sphere = new Sphere(6);
		Shape tetrahedron = new Tetrahedron(15, 12, 7, 6);
//		Shape tetreahedron = new Tetrahedron();
		ArrayList<Shape> shape = new ArrayList<>();
		shape.add(circle);
		shape.add(square);
		shape.add(triangle);
		shape.add(cube);
		shape.add(sphere);
		shape.add(tetrahedron);
		System.out.println("------------------>List Shape<-------------------");
		for (Shape value : shape) {
			System.out.println(value.toString());
			System.out.println("............(-.-)............");
		}

	}

}
