@Signup
Feature: Sign up Feature
Background:
Given User is on the sign up page

Scenario: Verify sign up page heading 
Then Sign up page heading should be displayed 


Scenario Outline: Verify sign up with Valid credentials and Invalid credentials 
When User Enters "<FullName>","<Email>" and "<Password>"
And User clicks Create account button
Then The sign up result should be "<Result>"
Examples:
| FullName | Email               | Password | Result  |
| Pavi     | validddd@gmail.com  | @Pavi123 | Success |
| Yoga     | invalids@gmail      | @Yoga289 | Failure |
| Pavi     | validddd@gmail.com  | @Pavi123 | Failure |


Scenario: Verify sign up with a password less than 6 characters
When User enter password with less than six char 
And User enters other fields such as Full Name,Email
And User click Create account button 
Then The system should prevent user to sign up with password less than six char 
