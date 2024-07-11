package Q4_bankaccount;

//Create a Java program that simulates a bank account. The program should allow
//users to deposit and withdraw money, check their balance.

public class Main {

	public static void main(String[] args) {
		
		Bank bk=new Bank();
		
		bk.checkBalance();
		
		bk.deposit(2000);
		bk.checkBalance();
		
		bk.withdraw(500);
		bk.checkBalance();
	}

}
