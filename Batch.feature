Feature: Batch Management

  Background: 
    Given Admin is logged into the LMS portal and on the dashboard page
    And Admin navigates to the 'Batch' page from the navigation bar clicking "Batch icon"

 Scenario: Validate header, footer, pagination, and default state of delete button in the Batch Page
   Then Admin should see 'Manage Batch' in the header and the total number of records in the footer
   And Admin should see pagination controls under the data table
   And the delete button should be disabled
   And the edit and delete icons for each row should be enabled
    
 Scenario: Add new batch and validate fields
   
   When Admin clicks "+ A New Batch" button and A new pop up with Batch details appears with all necessary fields
   And Admin fills in all the fields with valid values except for the optional "Description" and clicks 'save'
   Then The newly added batch should be present in the Manage Batch page data table
   
   
  
  		
  		
 
  		
   
  


 
  




