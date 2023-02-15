package numberchecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class numberIsDivisibleSteps {

    private int number;
    private String answer;

    @Given("Number is {int}")
    public void number_is(int number) {
        this.number = number;
    }
    @When("I ask whether this number is divisible by")
    public void i_ask_whether_is_divisible_by() {
        if (number % 3 == 0 && number % 5 == 0) {
            answer = "FizzBuzz";
        } else if (number % 5 == 0) {
            answer = "Buzz";
        } else if (number % 3 == 0) {
            answer = "Fizz";
        } else answer = "None";
    }
    @Then("Should be told {string}")
    public void should_be_told(String answer) {
        Assertions.assertEquals(answer, this.answer);
    }
}
