Feature: jaguar Land Rover HomePage

  Scenario: Verify homePage title
   			Given user is on the homePage
    		Then page title should contain "JLR Corporate Website"

  Scenario:  Logo should be visible
   			 Then Logo is displayed

  Scenario: Header nav links should load
    		Then header navigation links count is greater than 0

  Scenario: Hero banner should be visible
   			Then hero banner is displayed

  Scenario: Footer links should load
    		Then footer links count is greater than 0
