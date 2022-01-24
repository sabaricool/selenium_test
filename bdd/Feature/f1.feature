Feature:Test KSRTC application
Scenario:Test the login page with valid details
Given open chrome browser and url of the application
When enter username , password and click login button
Then success in login
Scenario: Test the register page with valid details
Given Open chrome browser and url of the application1
When Enter Email , fullname , mobilenumber and click on add button
Then Success in add
Scenario: Test the booking page with valid details
Given Open chrome browser and url of the application2
When Enter From , to , departure , return1 and click on search button
Then Success in search