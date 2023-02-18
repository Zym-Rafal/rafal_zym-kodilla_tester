package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {

    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);
    private int value;
    private String message;
    private int balance;

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assertions.assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request ${int}")
    public void i_request_$(int cash) {
        cashier.withdraw(wallet, cash);
    }
    @Then("This {int} should be dispensed")
    public void this_cash_should_be_dispensed(int cash) {
        Assertions.assertEquals(cash, cashSlot.getContents());
    }
    @Then("the balance of my wallet should be {int}")
    public void the_balance_of_my_wallet_should_be(Integer value) {
        Assertions.assertEquals(value,  wallet.getBalance(), "Incorrect wallet balance");
    }

    @Given("there is ${int} in my wallet")
    public void there_is_$_in_my_wallet(int balance) {
        this.balance = balance;
        wallet.deposit(balance);
        Assertions.assertEquals(balance, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I withdraw ${int}")
    public void i_withdraw_$(int amount) {
        this.message = cashier.withdraw(wallet, amount);
    }
    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals(balance, wallet.getBalance(), "Incorrect wallet balance");
    }
    @Then("I should be told that {string}")
    public void i_should_be_told_that(String string) {
        Assertions.assertEquals(string, message);
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        this.balance = wallet.getBalance();
    }
    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is_$(int balance) {
        Assertions.assertEquals(balance, this.balance, "Incorrect wallet balance");
    }

}
