package ex1_tp1;

public class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private int balance;

    public BankAccount(int acc, String name, int bal) {
        if (bal < 0)
            throw new Error("Balance <0", null);
        this.accountNumber = acc;
        this.accountHolderName = name;
        this.balance = bal;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        if (amount < 0)
            throw new Error("Amount negative", null);
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > this.balance)
            throw new Error("Amount > Balance", null);
        this.balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(555, "John Doe", 1000);
        account.deposit(100);
        account.withdraw(50);
        System.out.println(account.getAccountHolderName());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
    }
};
