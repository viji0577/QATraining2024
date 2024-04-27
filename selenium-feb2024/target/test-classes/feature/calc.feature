@Tag1
Feature: calculator file

Background: test background 
Given I am a calculator

@smoke
  Scenario: Check addition of two numbers
    Given two integers numbers 10 and 20
    When I add two numbers
    Then I verify the result is 30

@regression @datadriven
  Scenario Outline: Check  addition of two integers with multiple set of data
    Given two integers numbers <data1> and <data2>
    When I add two numbers
    Then I verify the result is <result>

   Examples: data tables
      | data1 | data2 | result |
      |    10 |    20 |     30 |
      |    15 |    16 |     31 |
      |    20 |    20 |     40 |
      |    30 |    20 |     50 |
      |    30 |    30 |     60 |
      |    30 |    40 |     60 |
      |    19 |    50 |     69 |
