Feature: Explore page feature
Scenario: Verify the Filter section on the explore businesses page 
Given User is on the explore businesses page 
When User select option from Category dropdown 
And User select option from Sort by dropdown
And User select option from Min rating dropdown 
And User select Verified only checkbox and clicks the result image
Then The matching result should be displayed on the explore page

