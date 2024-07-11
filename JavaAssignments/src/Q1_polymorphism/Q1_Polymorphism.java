package Q1_polymorphism;

/*1. Write a Java program that uses polymorphism by defining an interface called Shape
with methods to calculate the area and perimeter of a shape. Then create classes
that implement the Shape interface for different types of shapes, such as circles and
triangles.*/
public class Q1_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius=5;
		Circle c1=new Circle(5);
		
		System.out.println("Area of Circle with Radius ("+radius+") is ::"+c1.calculateArea());
		System.out.println("Perimeter of Circle with Radius ("+radius+") is ::"+c1.calculatePerimeter());
		
	  double triangle_a=5;
	  double triangle_base=5;
	  double triangle_c=5;
	  double triangle_height=5;
		
		Triangle t1=new Triangle(triangle_a, triangle_base, triangle_c, triangle_height);
		
		System.out.println("Area of Triangle  is ::"+t1.calculateArea());
		System.out.println("Perimeter of Triangle  is ::"+t1.calculatePerimeter());
		

	}

}
