package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String withdraw(Wallet wallet, int amount) {
        String result = wallet.debit(amount);
        if (result.equals("Done")) {
            cashSlot.dispense(amount);
        }
        return result;
    }
}