Feature: successfully create user in utest page
  Me as like tester
  I need to create a user
  To validate that users are successfully created

  Scenario: create an user successfully in page
    Given I want go to the page of utest
    When I enter the information to create the user in utest
    Then I validate the correct user creation in utest

