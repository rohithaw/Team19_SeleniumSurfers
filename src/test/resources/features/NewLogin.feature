
Feature: Login page validation
  
  @tag1
  Scenario Outline: Validating Login process for User with valid data
    Given User is on login page
    When User clicks on Login button with entering valid Username "<SheetName>" and rownumber <Rownumber>
    Then User should land on home page

    Examples: 
    
      | SheetName | Rownumber |
      | LoginPage |    0      |
   
   @tag2
  Scenario Outline: Validating Login process for User with invalid and null data
    Given User is on login page
    When User clicks on Login button with entering invalid Username "<SheetName>" and rownumber <Rownumber>
    And Admin enter value only in password and clicks login button 
    And Admin enter value only in username and clicks login button 
    Then Error message please check username/password
       
       Examples: 
    
      | SheetName | Rownumber |
      | LoginPage |    1      |
      | LoginPage |    2      |
      | LoginPage |    3      |
   
   @tag3
   Scenario: Validate sign in content and text field
   Given User is on login page
   When Admin gives the correct LMS portal URL
   Then Admin should see "Please login to LMS application"
   #And Admin should see two text field
   And Admin should "user" in the first text field
   And Admin should "password" in the second text field
   