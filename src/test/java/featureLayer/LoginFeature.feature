Feature: Login Functionality

Scenario: verify login with valid crdentials
Given user should navigate on homepage
When user click on login link and enter username and password and click
Then user logged in applicaion

Scenario: verify user login acc with valid crdentials
Given user should navigate on homepage
When user click on login link 
And enter username as "testacc4" and enter password as"test"
And click on login button
Then user logged in application and showing "welcome testacc4"