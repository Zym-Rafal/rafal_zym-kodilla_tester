Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $<cash>
    Then This <cash> should be dispensed
    Examples:
    | cash |
    | 199  |
    | 200  |
    | 0    |
    | 1    |
    | 201  |