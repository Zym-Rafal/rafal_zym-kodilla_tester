package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {

    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assertions.assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request ${int}")
    public void i_request_$(int cash) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, cash);
    }
    @Then("This {int} should be dispensed")
    public void this_cash_should_be_dispensed(int cash) {
        Assertions.assertEquals(cash, cashSlot.getContents());
    }
}
