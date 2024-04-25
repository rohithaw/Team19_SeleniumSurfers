@UserModule

Feature: User Page validation

Background: Logged on the LMS portal as adminand click on User Page from navigation bar
   Given Logged on the LMS portal as admin
   When Admin is on dashboard page after Login
   Then Admin clicks User button from navigation bar
  
  
Scenario: Validate elements on User Page
Then Admin Should see the data table with column names Id, Name, location, Phone Number, Edit/Delete
And  Delete button on top left as Disabled
   