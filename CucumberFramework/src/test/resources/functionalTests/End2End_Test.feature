Feature: Automated E2E Tests
Description: The purpose is to test E2E itegration

Scenario: Customer places an order by purchasing an order by search
Given user is on Home Page
When he search for "dress"
And choose to buy the first item
And moves to checkout from mini cart
And enter personal details on checkout page
And place the order