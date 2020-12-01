Feature: Logging and Logging out of the System

  Background: As a User I visit the Swag Labs Website
    Given I visit the Login Page

  Scenario: As a User I should be able to Logout after Logging in
    Given I log in with username "standard_user" and password "secret_sauce"
    When I click on the logout button
    Then the Page URL will be "https://www.saucedemo.com/index.html"

  Scenario Outline: As a User which cannot Log in, I should see the appropriate Errors
    When I log in with username "<username>" and password "secret_sauce"
    Then I will be shown an Error Message of "<expectedError>"
    Examples:
      | username        | expectedError                                                             |
      | locked_out_user | Epic sadface: Sorry, this user has been locked out.                       |
      | invalid_user    | Epic sadface: Username and password do not match any user in this service |