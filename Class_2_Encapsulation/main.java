public class main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000.0, "Checking");
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());

        account.freezeAccount();
        account.deposit(100.0); // This should not be allowed since the account is frozen
        account.unfreezeAccount();  


        SavingsAccount savingsAccount = new SavingsAccount("Jane Doe", 2000.0, 5.0);
        savingsAccount.deposit(300.0);
        savingsAccount.applyInterest();
        System.out.println("Savings Account Holder: " + savingsAccount.getAccountHolder());
        System.out.println("Savings Balance: " + savingsAccount.getBalance());
    }
    
}
