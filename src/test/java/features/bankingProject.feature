@BankOps
Feature: Customer Deposit and Transactions

  Scenario: Deposit 1500 into the customer's first account and validate
    Given I am logged in as a customer
    When I click the 'Customer Login' button
    Then I should see home screen
    Then I select first customer name
    Then I click 'Login' button
    Then I should see welcome
    And I select the first account
    And I click 'Deposit' tab
    Then I deposit 1500 into the field
    And I click 'Deposit' button
    Then I validate the deposit was successful
    And I logout

  Scenario: Deposit 1500 into each account and validate
    Given I am logged in as a customer
    When I click the 'Customer Login' button
    Then I should see home screen
    Then I select first customer name
    Then I click 'Login' button
    Then I should see welcome
    And I select the first account
    And I click 'Deposit' tab
    Then I deposit 1500 into each account
    And I click 'Deposit' button
    Then I validate the deposit was successful
    And I logout

  Scenario: Deposit and withdraw specific amount and validate transactions
    Given I am logged in as a customer
    When I click the 'Customer Login' button
    Then I should see home screen
    Then I select first customer name
    Then I click 'Login' button
    Then I should see welcome
    And I select the first account
    And I click 'Deposit' tab
    #    Then I deposit <amount>
    Then I deposit 31459 into the field
    And I click 'Deposit' button
    Then I validate the deposit was successful
    When I open transactions
    Then I validate the transaction appears
    Then I logout
    Then I select first customer name
    Then I click 'Login' button
    Then I should see welcome
    And I click 'Withdrawl' tab
    And I withdraw 31459
    And I click 'Withdraw' button
    Then I validate the current balance is the original balance
    When I open transactions
    Then I validate the transaction appears
    And I logout
# Examples:
#  | amount |
#  | 1500   |
#  | 31459  |




#  Scenario: Customer deposits 1500 into their first account
#    Given I am logged in as a customer
#    When I deposit 1500 into my first account
#    Then the deposit should be successful
#    And my account balance should increase by $1500
#
#  Scenario: reset bank customer  account
#    Given I am logged in as a customer
#    When I reset his first account
#    Then the reset should be successful
#    And my account balance should be zero
#
#
#  Scenario: Deposit into each account
#    Given the customer is logged in
#    When the customer selects each account
#    And deposits 1500 into the account
#    Then the deposit should be successful
#    And the customer logs out
#
#  Scenario: Customer deposit and withdrawal
#    Given the customer is logged in
#    When the customer selects their first account
#    And the customer deposits 31459
#    Then the deposit should be successful
#    When the customer views transactions
#    Then the deposit transaction should appear
#    When the customer withdraws 31459
#    Then the withdrawal should be successful
#    And the current balance should be the original balance
#    When the customer views transactions
#    Then the withdrawal transaction should appear
#    And the customer logs out