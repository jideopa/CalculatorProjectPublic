@Calculator
Feature: Addition feature

  @Addition
  Scenario: Successful addition
    Given  user is on the calculator page
    When user perform addition of 8 plus 8
    Then User should be able to see the expected result 16
@Subtraction
    Scenario: Successful subtraction
      Given user is on the calculator page
      When  user perform subtraction of 9 minus 1
      Then  user should be able to see the expected result of 8
@Multiplication
    Scenario: Successful Multiplication
      Given user is on the calculator page
      When  user perform multiplication of 5 multiply 2
      Then  user should be able to view the expected result of 10