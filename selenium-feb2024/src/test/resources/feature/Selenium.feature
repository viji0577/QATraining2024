@tag2
Feature: Orange Hr1 application login

 @smoke  @login
  Scenario: Verify user login
    Given I navigate Url on browser
    When I put user name in user input field
    And I enter password in password input field
    And I click on loging button
    Then I verify user login successfully
    And Verify all menu options
      | Header      |
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
