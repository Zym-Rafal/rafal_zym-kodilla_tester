package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }

    public String debit(int money) {
        if (this.balance - money < 0) {
            return "I don't have enough money in my wallet";
        }
        this.balance -= money;
        return "Done";
    }
}
