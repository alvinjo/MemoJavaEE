Feature: Adding/Updating notes on the memo site
  As a user
  I want to login to the memo site
  So that I can add, update and delete my notes


Scenario: Login to account
  Given the correct web address
  When I enter my user credentials and press login
  Then I am taken to my user page


Scenario: Add a note
  Given the correct web address
  When I enter my user credentials and press login
  And I enter value in field and press add button
  Then This note is added


Scenario: Delete a note
  Given the correct web address
  When I enter my user credentials and press login
  And I enter value in field and press add button
  And I press delete button
  Then The note is deleted

Scenario: Update a note
  Given the correct web address
  When I enter my user credentials and press login
  And I enter value in field and press add button
  And I change the value and press update button
  Then The note is updated