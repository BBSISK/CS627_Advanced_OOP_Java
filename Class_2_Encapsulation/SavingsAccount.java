public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance, "Savings");
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
       if(!isFrozen) {
            double interest = getBalance() * interestRate / 100;
            deposit(interest);
            System.out.println("Applied interest: " + interest);
            System.out.println("Account Type: " + accountType);
        }
    }
}