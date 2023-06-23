@tag
Feature: Testing Order API

  @tag1
  Scenario Outline: As a QA I want to test Order API
    Given I want to test the API Order
    When I execute the <testCase> test case of Order API
    Then I verify the response of Order API

    Examples: 
      | testCase                                |
      | Order is Created                        |
      | Order is failed due duplicate order_id  |
      | Order is failed due empty order_id      |
      | Order is failed due empty order_status  |
      | Order is failed due empty timestamp     |
      | Order is failed due empty special_order |
