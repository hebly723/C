//Fig 
package cn.com.dick.three.Account;

public class Account {
	private double balance;//instance variable that stores the balance
	
	//constructor
	public Account(double initialBalance){
		//validate that initialBalance is greater than 0.0
		//if it is not, balance is initialized to the default value 0.0
		if (initialBalance>0.0)
			balance = initialBalance;
		
	}//end Account constructor
	
	//credit(add) an amount to the account
	public void credit(double amount)
	{
		balance = balance + amount;//add amount to the balance
	}//end method credit
	
	//Debit (minus) an amount to the account
	public void debit(double amount)
	{
		balance = balance - amount;//debit amount to the balance
	}//end method debit
	
	//return the account balance
	public double getBalance() 
	{
		return balance;//gives the value of balance to the calling method
	}//end method getBalance
	
}//end class Account 
