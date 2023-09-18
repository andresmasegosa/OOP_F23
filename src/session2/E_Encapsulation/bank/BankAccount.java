package session2.E_Encapsulation.bank;


public class BankAccount {

    public String fullName;
    public int balance;

    public BankAccount(String fullName, int balance) {
        this.fullName = fullName;
        this.balance = balance;
    }

    public void addMoney(int quantity){
        if (quantity>0)
            this.balance = this.balance+quantity;
    }


    public boolean withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }

}