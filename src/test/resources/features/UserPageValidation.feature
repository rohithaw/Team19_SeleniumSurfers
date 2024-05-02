@UserModule
Feature: User Page validation

  Background: Logged on the LMS portal as admin and click on User Page from navigation bar
       Given Logged on the LMS portal as admin
       When Admin is on dashboard page after Login
       Then Admin clicks User button from navigation bar


  Scenario: Validate header, footer, pagination, and default state of delete button in the User Page
    Then Admin should see 'Manage User' in the header and the total number of records in the footer
    And Admin should see pagination controls under the data table
    And the delete button should be disabled
    And the edit and delete icons for each row should be enabled

  Scenario: Validate data table Elements in the User Page
    Then Admin Should see the data table with headers Id, Name, location, Phone Number, Edit/Delete
    And Admin should be able to see the + A New User , + Assign Student , + Assign Staff button
    And Each row in the data table should have a checkbox

  Scenario: Validate Search Field in the User Page
    Then Admin should be able to see the search text box above the data table
    And Admin should see user displayed with the entered name
    And Admin enter keyword not present zero enteries must be displayed

  Scenario: Validate popup on New User Window
    Given Admin click +A New User button
    When New pop up with user details appears
    Then check all the fields in the pop up page with user details

  Scenario: Validate Fields without entering data in User page
    Given Admin click +A New User button
    When Admin clicks on submit button without entering data
    Then user willnot be created and Admin gets error message

  Scenario: 
    Given Admin click +A New User button
    When Admin clicks Cancel Icon on User Details form
    Then User Details popup window should be closed without saving

  Scenario Outline: Validating New User Creation with Valid data
    Given Admin click +A New User button
    When New pop up with user details appears
    Then Fill in all Valid Values as per "<SheetName>" and rownumber <Rownumber>
    And Click Submit and Validate "<Message>"
    Then Admin should view newly added user in the data table in Manage user page

    Examples: 
      | SheetName | Rownumber | Message                 |
      | UserPage  |         0 | User Added Successfully |
      | UserPage  |         1 | User Added Successfully |
      | UserPage  |         2 | Failed to create User   |
