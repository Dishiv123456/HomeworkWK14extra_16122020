Feature: login Functionally
  as a user want to login successfully
@smoke,@regression
  Scenario: : as user i want login Account Successfully
    Given i am on home page
    When i enter user name "Admin"
    And i enter password "admin123"
    And i click on login button
    Then i should be able to login successfully
@sanity,@regression
    Scenario: as i user i want log out successfully
      Given i am on home page
      When i enter user name "Admin"
      And i enter password "admin123"
      And i click on login button
      And i click on welcome admin
      And i click on log out button
      Then i should be able to log out successfully
