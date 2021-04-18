Feature: Login functionality for LeafTaps


@smoke @sanity
Scenario Outline: TC_001 Login with positive credentials

Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then Home page should be displayed

Examples: 
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCsr'|'crmsfa'|

@regression
Scenario: TC_002 Login with negative credentials

Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa123'
When Click on login button
But Error message should get displayed

