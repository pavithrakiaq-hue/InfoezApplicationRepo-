Feature: Home page feature
Background:
Given User is on the home page

Scenario Outline: Verify the search with valid and Invalid service name 
When User search valid "<Name>" on the search field
And User click search button 
Then "<Expected>" result should be displayed
Examples:
| Name    | Expected             |
| Plumber | Matching             |
| PLUMBER | Matching             |
| Cakes   | Matching             |
| djfhjkd | No business found    |
| Invalid | No business found    |


Scenario Outline: Verify search with valid and Invalid city name
When User search with valid "<City>" name 
And User clicks the search button 
Then The "<Expected>" result should be displayed 
Examples:
| City       | Expected          |
| Chennai    | Matching          |
| Bengaluru  | Matching          |
| CHENNAI    | Matching          |
| Invalid    | No business found |
| Kumbakonam | No business found |


Scenario: Verify search with empty inputs
When User search with empty fields 
Then The user should not be navigated to the result page 

Scenario: Verify that the user can redirected to the Explore page 
When User navigated from home page to explore page 
Then The user should be redirected to the explore page  



