package Q5_diffAbstractInterface;

public abstract class TestAbstract {
	
	//variable in abstract class need not to be final
	public double pi=3.14;
	
	
	public abstract void print(String msg);
	
	public void printAbsract() {
		//abstract can have concreate method 
		System.out.println("Concreate Mthod in abstract class");
	}
	
}
