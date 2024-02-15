//Extends BankAccount class
public class SavingsAccount extends BankAccount {
	//Status field to determine if a account is active
	static boolean isInactive;
	
	//Constructor to initialize balance and annual interest rate
	public SavingsAccount(double balance, double annualIntrestRate) {
		super(balance, annualIntrestRate);
		//If balance is less than 25 it is inactive
		isInactive=super.getBalance()<25;
		
	}
	//Method to determine if an account is inactive before a withdraw
	public void withdraw(double amount) {
		//If balance is less than 25 set isInactive boolean to true
		if (super.getBalance()<25) {
			isInactive=true;
		}
		//Else proceed with withdraw
		else {
			super.withdraw(amount);
	}
	}
	//Method to determine if an account is inactive before a deposit
	public void deposit(double amount) {
		//Deposit amount
		super.deposit(amount);
		//If balance becomes greater than 25 set isInactive boolean false
		if (super.getBalance()>25) {
			isInactive=false;
		}}
	//Method to check number of withdrawals 
		public void monthlyProcess() {
			//If withdrawals made reach an amount greater than 4 add 1 dollar to the service charge
			if (super.getNumberOfWithdrawls()>4) {
				super.serviceCharge+=1;
			}
			//If balance becomes less than 25 turn isInactive boolean true
			if (super.getBalance()<25) {
				isInactive=true;
			}}
}