public class BankDriver {
    public static void main(String[] args) {
        // Test BankAccount
        SavingsAccount account = new SavingsAccount(1000, 5);
        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(500);
        System.out.println("Balance after deposit: $" + account.getBalance());

        account.withdraw(200);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        account.calcInterest();
        System.out.println("Balance after interest calculation: $" + account.getBalance());

        account.setServiceCharge(10);
        account.monthlyProcess();
        System.out.println("Balance after monthly process: $" + account.getBalance());

        // Test SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(50, 3);
        System.out.println("Savings Account Initial Balance: $" + savingsAccount.getBalance());

        savingsAccount.withdraw(20);
        System.out.println("Savings Account Balance after withdrawal: $" + savingsAccount.getBalance());

        savingsAccount.deposit(30);
        System.out.println("Savings Account Balance after deposit: $" + savingsAccount.getBalance());

        savingsAccount.monthlyProcess();
        System.out.println("Savings Account Balance after monthly process: $" + savingsAccount.getBalance());

        System.out.println("Is Savings Account Inactive? " + SavingsAccount.isInactive);
    }
}