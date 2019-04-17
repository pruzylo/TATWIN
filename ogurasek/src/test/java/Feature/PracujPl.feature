Feature: Feature File

@Test1
Scenario: User can log in
Given User opens pracuj.pl
When User logs in
Then user is logged in
And page is closed

@Test2
Scenario: User can edit profile settings
Given User opens pracuj.pl
When User logs in
And User moves to professional profile
Then user is on professional profile page
And page is closed

@Test3
Scenario: User can change password
Given User opens pracuj.pl
When User logs in
Then User moves to settings
And User moves to profile settings
And User changes password
And page is closed

@Test4
Scenario: User