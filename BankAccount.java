
public abstract class BankAccount {
	//Instance fields for data
	double balance, numberOfDeposits, numberOfWithdrawls, annualInterestRate;
	protected double serviceCharge;
	
	//Constructor to accept balance and annual interest rate
	public BankAccount(double balance, double annualInterestRate) {
		
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
	}
	//Deposit method accepts amount
	public void deposit(double amount) {
		//Adds amount to balance
		this.balance+= amount;
		//Increment number to deposits
		this.numberOfDeposits++;
		
	}
	//Withdraw method accepts amount
	public void withdraw(double amount) {
		//Subtracts amount from balance
		this.balance-=amount;
		//Increment number of withdrawals
		this.numberOfWithdrawls++;		
	}
	//Method to calculate monthly interest
	public void calcInterest() {
		//Divide annual interest rate by 12 to get monthly interest rate
		double monthlyIntrestRate= annualInterestRate/12;
		//Multiply monthly interest rate by balance to get total monthly interest
		double monthlyInterest= monthlyIntrestRate*balance;
		//Add monthly interest to balance
		this.balance+=monthlyInterest;
		
	}
	//Method to subtract monthly service charge
	public void monthlyProcess() {
		//Subtracts service charge from balance
		this.balance-=serviceCharge;
		//Calling method to calculate monthly interest 
		calcInterest();
		
		//Setting deposits, withdrawals, and service charge to zero
		this.numberOfDeposits=0;
		this.numberOfWithdrawls=0;
		this.serviceCharge=0;
	}
	//Getters and setters for class fields 
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getNumberOfDeposits() {
		return numberOfDeposits;
	}
	
	public void setNumberOfDeposits(double numberOfDeposits) {
		this.numberOfDeposits = numberOfDeposits;
	}
	
	public double getNumberOfWithdrawls() {
		return numberOfWithdrawls;
	}

	public void setNumberOfWithdrawls(double numberOfWithdrawls) {
		this.numberOfWithdrawls = numberOfWithdrawls;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getServiceCharge() {
		return serviceCharge;
	}
	
	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	
	
}
