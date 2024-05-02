@LMSModule
Feature: Login page validation

  Scenario Outline: Validating Login process for User with valid data
    Given User is on login page
    When User clicks on Login button with entering valid Username "<SheetName>" and rownumber <Rownumber>
    Then User click submit and display "<Message>"

    Examples: 
    
      | SheetName | Rownumber |  Message   |
      | LoginPage |    0      | Login Successful |
      | LoginPage |    1      | User |
      | LoginPage |    2      | Pasword    |
      | LoginPage |    3      | Invalid Username and Password |
      
      
       
  Scenario Outline: Verify text field is present
    Given User is on login page
    When Admin should user and password in the text field and "asterik" symbol
    Then Admin should see login button
    
    
    Scenario Outline: Verify logo is present
    Given User is on login page
    Then Admin should see logo on the leftside and Admin should see  LMS - Learning Management System with company name below
    Then Admin should see "Please login to LMS application"
   
   
    Scenario Outline: Verify elements in login screen
    Given User is on login page
    Then Admin should see user and Password in gray color