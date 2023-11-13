package session8.A_Bank;


public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isOverdrawn(){
        if (this.balance<0)
            return true;
        else
            return false;
    }

    public void deposit(int amount) {
        assert amount>=0: "Trying to deposit negative amount";
        this.balance += amount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.deposit(-100);
    }

}