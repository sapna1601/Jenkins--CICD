Feature: Calculator operations

@test
  Scenario: Addition of two numbers
    Given I have two numbers 5 and 3
    When I add the numbers
    Then the result should be 8

@test
  Scenario: Subtraction of two numbers
    Given I have two numbers 10 and 4
    When I subtract the numbers
    Then the result should be 6

@test
  Scenario: Multiplication of two numbers
    Given I have two numbers 6 and 7
    When I multiply the numbers
    Then the result should be 42

@test
  Scenario: Division of two numbers
    Given I have two numbers 20 and 4
    When I divide the numbers
    Then the result should be 5