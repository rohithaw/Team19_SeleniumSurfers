@userPage
Feature: verify the userPage functionalities

  Background: 
    Given Admin is logged into the LMS portal and on the User page
    When Admin is on Manage User Page
    Then Admin clicks on Assign Student button
    
 @Assign_Student
  Scenario: Admin Able to see assign student
    Given Admin should see all the details are there in popup open for assign student
     When Admin clicks on <Save> without any details
    Then Admin gets error message alert

  Scenario: Check Admin Able to assign student
    Given Admin should see all the details are there in popup open for assign student
    When Admin clicks on <Save> with selecting Status as Inactive
    Then Admin gets a message alert "Failed"

  Scenario: Check Admin Able to assign student
    Given Admin should see all the details are there in popup open for assign student
    When Admin clicks on <Cancel> with selecting all the valid details
    Then Admin able to see assign student popup closed

  Scenario: Check Admin Able to assign student
    Given Admin should see all the details are there in popup open for assign student
    When Admin clicks on <Save> with selecting all the valid details
    Then Admin gets success message "Successfull"

    
 @Assign_Staff
   
  Scenario: Check Admin Able to assign staff without any details
    Given Admin should see all the details are there in popup open for assign Staff
    When Admin clicks on <Save> without any details
    Then Admin gets assign staff error message alert

  Scenario: Check Admin Able to assign staff with inactive 
    Given Admin should see all the details are there in popup open for assign Staff
    When Admin clicks on <Save> with selecting Status as Inactive
    Then Admin gets a message alert "Failed"

   Scenario: Check Admin Able to assign staff 
    Given Admin should see all the details are there in popup open for assign Staff
    When Admin clicks on <Cancel> with selecting all the valid details
    Then Admin able to see assign staff popup closed

  Scenario: Check Admin Able to assign staff with all valid details
    Given Admin should see all the details are there in popup open for assign Staff
    When Admin clicks on <Save> with selecting all the valid details
    Then Admin gets success message "Successfull"
    
  @Delete_User
  
  Scenario: Validate row-level delete and alert options
    When Admin clicks the delete icon on a specific batch row alert with 'yes' and 'no' appears clicks yes for deletion in User
    Then success message apears in User 
    When Admin clicks the delete icon on specific row alert with yes and no appears clicks "No"  in User
    Then batch should still be listed in the data table in User
    
 @Delete_Multiple_User
 
  Scenario: Validate the delete functionality with multiple selections
    When Admin selects one batch row and clicks the delete icon under the "Manage Batch" header in User
    Then selected batch row is deleted from the data table in User
    When Admin selects multiple batch rows and clicks the delete icon under the "Manage Batch" header in User
    Then selected batch rows are deleted from the data table in User
    