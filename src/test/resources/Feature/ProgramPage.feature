Feature: Manage program Validation

  Background: 
    Given Admin is logged into the LMS portal
    When Admin navigates to the Program page giving 'username' and 'password'
    Then click Program

  Scenario: Validate header,footer,pagination and default state of delete button in the Program page
    Then Admin should see 'Manage Program' in the header and the total number of records in the footer
    And Admin should see pagination controls under the data table
    And the delete button should be disabled
    And the edit and delete icons for each row should be enabled
    And the sorticon check box and searchbox should be validated
    And Add New program

  Scenario: Validating Edit functionality
    Given Admin is in Program Page
    When Admin clicks Edit button
    When Admin updates with data
    Then Admin should see Updated message.

Scenario: Validating Delete Functionality row level delete and alert options
    When Admin clicks the delete icon on a specific program row alert with 'yes' and 'no' appears clicks yes for deletion 
    Then success message apears 
    When Admin clicks the delete icon on specific program row alert with yes and no appears clicks "No" 
    Then program should still be listed in the data table

  Scenario: Validate the delete functionality with multiple selections
    When Admin selects one program row and clicks the delete icon under the "Manage Program" header
    Then selected program row is deleted from the data table
    When Admin selects multiple program rows and clicks the delete icon under the "Manage Program" header
    Then selected program rows are deleted from the data table
