Feature: Title of your feature
   Background: Open browser and Launch Url
  Given User should open browser as "chrome"
  And User should Launch url
   @sanity
  Scenario: Place an order
    
    Given User enter Username "standard_user"
    And User enter Password "secret_sauce"
    When Click on login button
    Then User should navigate to HomePage
    Given Add Backpack to the cart
    And Click Checkout and enter details
    When Click on continue and Finish
    Then Verify the Order Placed Message
  