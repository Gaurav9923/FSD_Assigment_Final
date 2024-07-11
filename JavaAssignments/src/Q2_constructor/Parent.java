package Q2_constructor;

public class Parent {
	
	public String msg;
	
	public Parent() {
		// TODO Auto-generated constructor stub
		System.out.println("Parent.Parent() empty constructor called");
	}
	
	public Parent(String msg) {
		
		this.msg=msg;
		
		System.out.println("Parent.Parent()");
		System.out.println("Parent class constructor called ::"+ msg);
		
	}

}
