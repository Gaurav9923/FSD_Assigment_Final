package Q5_diffAbstractInterface;

public class Main extends TestAbstract implements TestInterface {
	//a class can extend and inherit a class and interface simultaneously
	public static void main(String[] args) {
		
		Main main=new  Main();
		main.printAbsract();
		main.printInterface();
		
	}

	
	//if dont provide implemtation for absract method then need to make main class abstract
	@Override
	public void print(String msg) {
			//abstract class need to be extended and provide implementation for abstract method
			System.out.println("Printing message-->"+msg);
	}

	@Override
	public void printInterface() {
		//interface provide 100% abstraction
		System.out.println("interface provide 100% abstraction");
		
	}
}
