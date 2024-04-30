Feature: Batch Management

  Background: 
    Given Admin is logged into the LMS portal and on the dashboard page
    And Admin navigates to the 'Batch' page from the navigation bar clicking "Batch icon"
@tag1
  Scenario: Validate header,data table header, footer, pagination, and default state of delete button in the Batch Page
   Then Admin should see 'Manage Batch' in the header and the total number of records in the footer
   And  the data table should show headers "Batch name", "Batch Description", "Batch Status", "No. of classes", "Program Name", "Edit/Delete" 
   And  Admin should see pagination controls under the data table and the multipedelete button should be disabled
   And the checkbox edit ,delete icons for each row should be enabled
 @tag2   
  Scenario Outline: Comprehensive validation and submission of the new batch form in the popup
  When Admin clicks on "+ A New Batch" button to open the Batch details popup with all necessary fields
  And Admin attempts to enter "<Batch Name>", "<Description>", "<Status>", "<No of Classes>", and "<Program Name>" in the popup
  Then Admin should see valid inputs or error messages corresponding to each field in the popup
  And if all mandatory fields are valid, Admin clicks "save"
  Then the outcome should be "<Outcome>"
  And if "<Outcome>" contains "Successfully created", 

Examples:
  | Batch Name | Description | Status  | No of Classes | Program Name | Outcome                                                          |
  |            | SDET        | ACTIVE  | 34            | JAVA         | "Batch Name is required. This field should start..."             |
  | B01        | SDET        | ACTIVE  |               | PYTHON       | "Number of Classes is required."                                 |
  | B02        | SDET        | ACTIVE  | 88            |              | "Program Name is required."                                      |
  | B09        |             | ACTIVE  | 44            | JAVA         | "Batch Description is required. This field should start..."      |
  | B01        | SDET        | ACTIVE  | 56            | PLAYWRIGHT   | "Batch already exists with given Batch Name"               |
  | B09        | SDET        |         | 10						 |playwright    | "status is required"                                              |
  | SURFER     | SDET        | ACTIVE  | 6             | SELENIUM     | "Successfully batch created"                                     |
  
   @tag3 
  Scenario: Validate row-level editicon 
    When  Admin clicks the edit icon on a specific batch row and batch details popup appears
    And   Admin clicks "save"  and the successfully batch updated is displayed
    When  Admin erase the mandatory field  error message appear
    Then  Admin tries erase description field which is optional error message appears 
   
   @tag4
  Scenario: Validate row-level delete and alert options
    When Admin clicks the delete icon on a specific batch row alert with 'yes' and 'no' appears and validating and clicks yes
    Then success message apears 
    When Admin clicks the delete icon on specific row alert with yes and no appears clicks "No" 
    Then batch should still be listed in the data table
@tag5
  Scenario: Validate the delete functionality with multiple selections
    When Admin selects one batch row and clicks the delete icon under the "Manage Batch" header
    Then selected batch row is deleted from the data table
    When Admin selects multiple batch rows and clicks the delete icon under the "Manage Batch" header
    Then selected batch rows are deleted from the data table 
 

 
 
  




