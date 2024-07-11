package Q1_polymorphism;

public class Triangle implements Shape {
	
	Double a;
	Double base;
	Double height;
	Double c;
	
	public Triangle(Double a,Double base,Double c,Double height) {
		// TODO Auto-generated constructor stub
		this.base=base;
		this.height=height;
		this.a=a;
		this.c=c;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return a+base+c;
	}

}
