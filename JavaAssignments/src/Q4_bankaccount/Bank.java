package Q4_bankaccount;

public class Bank {
	
	private  double total_balance;
	
	public void deposit(double amount) {
		System.out.println("You are depositing ::"+amount+" Rs.");
		this.total_balance=this.total_balance+amount;
	}
	
	public  void withdraw(double amount) {
		System.out.println("You are withdrawing ::"+amount+" Rs.");
		this.total_balance=this.total_balance-amount;
	}
	
	public void checkBalance() {
		System.out.println("Total Balance is "+this.total_balance);;
	}
	

}
