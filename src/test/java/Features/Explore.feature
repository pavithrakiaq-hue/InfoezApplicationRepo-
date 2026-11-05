Feature: Explore page feature
Background:
Given User is on the explore businesses page 
Scenario: Verify the Filter section on the explore businesses page 
When User select option from Category dropdown 
And User select option from Sort by dropdown
And User select option from Min rating dropdown 
And User select Verified only checkbox and clicks the result image
Then The matching result should be displayed on the explore page

Scenario: Verify the Send Enquiry,Save,Claim and Write review button without sign in
When User clicks Save button 
Then Error message should be displayed 
When User clicks Claim button and fills the required details 
And Clicks the submit claim button 
Then The error message should be displayed 
When User click send enquiry button
And User fills the required details and Clicks the send enquiry button 
Then Validation message should be displayed 

