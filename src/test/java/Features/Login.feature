Feature: Login into application

Scenario Outline: Positive test validate login
Given Initialise browser with chrome
And Navigte to "http://www.qaclickacademy.com/"
And Click on login button to navigate to sign in page
When User enters <username> and <password> and logs in
Then Verify user is succesfully logged in
And Close browser

Examples: 
|username    		|password|
|test99@gmail.com	|123456|
|test12@gmail.com	|1234569|

