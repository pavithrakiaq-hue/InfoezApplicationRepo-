Feature: Login feature
Background: 
Given User is on the login page

Scenario: Verify login page heading 
Then the login heading should be displayed 

Scenario Outline: Verify login with valid and invalid credentials
When User enters valid "<Email>"
Then Email should be entered on Email field 
When User enter valid "<Password>"
Then Password should be entered on Password field
When User clicks sign in button 
Then The login should be "<Result>"
Examples:
| Email                | Password     | Result  |
| customer@infoez.com  | Customer@123 | Success |
| customer@infoez.com  | hsgdjkjflkd  | Failure |
| jhopkkj@gmail.com    | Customer@123 | Failure |
| 234345@gmail.com     | dfgh         | Failure |