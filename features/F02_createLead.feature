Feature: leaftaps application test cases

@smoke @sanity
Scenario: TC_03_Create Lead
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on login button
Then Get current title
Given Click crmsfa link
And Click on Leads
Given Click Create Lead Button
And Enter company name
And Enter Firstname
And Enter lastname
When click on Create Lead


