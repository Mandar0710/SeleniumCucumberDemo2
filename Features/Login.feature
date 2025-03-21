Feature: Login
Scenario: Succefully Login with Credentials
	Given User lanuch Chrome browser
	When user opens the URL "https://tutorialsninja.com/demo/"
	Then Enter the valid user name "rohand581@gmail.com" and password "test@123"
	And Click on login
	Then Page title should be "My Account"
	When User click on Logout
	Then Page title should be "Account Logout"
	And Close the browser
	
Scenario Outline:: Succefully Login with Credentials
	Given User lanuch Chrome browser
	When user opens the URL "https://tutorialsninja.com/demo/"
	Then Enter the valid user name "<email>" and password "<password>"
	And Click on login
	Then Page title should be "My Account"
	When User click on Logout
	Then Page title should be "Account Logout"
	And Close the browser
	
	Examples:
		|email|password|
		|abc@gmail.com|3212|
		|rohand581@gmail.com|test@123|
		
