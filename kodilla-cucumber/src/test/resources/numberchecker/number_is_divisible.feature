Feature: Is this number divisible by the given numbers?

  Scenario Outline: Number is divisible by 3 or 5 or by both numbers or not
    Given Number is <randomNumber>
    When I ask whether this number is divisible by
    Then Should be told <answer>
    Examples:
      | randomNumber | answer     |
      | 10           | "Buzz"     |
      | 15           | "FizzBuzz" |
      | 9            | "Fizz"     |
      | 11           | "None"     |
