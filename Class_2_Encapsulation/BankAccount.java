public class BankAccount {
    private String accountHolder;
    private double balance;
    protected String accountType;
    boolean isFrozen;


    public BankAccount(String accountHolder, double initialBalance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountType = accountType;
        this.isFrozen = false;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = getBalance() + amount ;  // could also be balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            balance = getBalance() - amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void freezeAccount() {
        isFrozen = true;
        System.out.println("Account frozen.");
    }

    public void unfreezeAccount() {
        isFrozen = false;
        System.out.println("Account unfrozen.");
    }
}   