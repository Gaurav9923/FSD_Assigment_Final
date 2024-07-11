package Q1_polymorphism;

public class Circle implements Shape {
	public static final Double PI=3.14;
	Integer radius;
	
	Circle(Integer radius){
		this.radius=radius;
	}
	
	

	public Integer getRadius() {
		return radius;
	}



	public void setRadius(Integer radius) {
		this.radius = radius;
	}



	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
		
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		
		return 2*PI*radius;
	}

}
