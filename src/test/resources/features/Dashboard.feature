Feature: Dashboard Page

  Background: Admin gives the correct LMS portal URL

  @tag1
  Scenario: Verify after login  admin lands on manage program as dashboard page
    Given Admin starts from Home Page
    When Admin enters valid credentials and click login button
    Then Admin should see manage program as header

  @tag2
  Scenario: Verify LMS title
    Given Admin starts from Home Page
    When Admin enters valid credentials and click login button
    Then Admin should see LMS -Learning management system  as title

  @tag3
  Scenario: Verify  LMS title alignment
    Given Admin starts from Home Page
    When Admin enters valid credentials and click login button 
    Then LMS title should be on the top left corner of page

   @tag4
  Scenario: Validate navigation bar by order  
   Given Admin starts from Home Page
   When Admin enters valid credentials and click login button
   Then Admin should see program in the 1st place
   And Admin should see batch in the 2nd place 
   And Admin should see user in the  3rd place
   And Admin should see logout in the 4th place 
   
   @tag5
   Scenario: Validate navigation bar text and allignment
   Given Admin starts from Home Page
   When Admin enters valid credentials and click login button
   Then Admin should see correct spelling in navigation bar text
   And Admin should see correct spelling and space in LMS title
   And Admin should see the navigation bar text on the top right side
   
   @tag6
   Scenario: Verify the response time
   Given Admin starts from Home Page
   When Admin enters valid credentials and click login button
   Then Maximum navigation time in milliseconds, defaults to 30 seconds
   And HTTP response >= 400. Then the link is broken
  
   @tag7  
  Scenario: Verify Logout button function
   Given Admin starts from Home Page
   When Admin enters valid credentials and click login button
   And Admin click Logout button on navigation bar
   Then Admin should land on login in page