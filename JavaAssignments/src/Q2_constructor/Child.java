package Q2_constructor;


public class Child extends Parent{
	
	public String msg;
	
	public Child() {
		// TODO Auto-generated constructor stub
		System.out.println("child.child() Empty Constructor called ");
	}
	
	Child(String msg){
		
		super();
		this.msg=msg;
		
		
		System.out.println("child constructor called ::"+msg);
	}
}
