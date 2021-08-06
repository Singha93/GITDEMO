Feature: Search and place orders for Vegetables


Scenario: Search for items and validate results
Given User is on Greencart Landing page
When User searched for Cucumber Vegetable
Then Cucumber results are displayed


Scenario: Search for items and validate results
Given User is on Greencart Landing page
When User searched for Brinjal Vegetable
Then Brinjal results are displayed
And Added items to cart
And User proceed to checkout page for purchase
Then verify selected Brinjal items are displayed in the checkout page

@SeleniumTests
Scenario Outline: Search for items and validate results
Given User is on Greencart Landing page
When User searched for <Username> Vegetable
Then <Username> results are displayed
And Added items to cart
And User proceed to checkout page for purchase
Then verify selected <Username> items are displayed in the checkout page

Examples:
|Username|
|Brinjal|
|Cucumber|
|Beetroot|