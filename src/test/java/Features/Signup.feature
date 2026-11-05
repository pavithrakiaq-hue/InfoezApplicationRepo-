 
Feature: Sign up Feature
Background:
Given User is on the sign up page

Scenario: Verify sign up page heading 
Then Sign up page heading should be displayed 


Scenario Outline: Verify sign up with Valid credentials and Invalid credentials 
When User enters "<FullName>"
Then Full name should be entered on Full name field 
When User enters the "<Email>" 
Then Email value should be entered on email field 
When User enter the "<Password>" 
Then Password value should be entered on password field 
When User clicks Create account button 
Then The sign up validation should be "<Result>"
Examples:
| FullName | Email                | Password | Result   |
| Pavi     | validdmm@gmail.com   | @Pavi123 | Success  |
| Yoga     | invalids@gmail       | @Yoga289 | Toast    |
| Pavi     | validdmm@gmail.com   | @Pavi123 | Toast    |
| varsha   | passs@gmail.com      | dth      | Tooltip  |
