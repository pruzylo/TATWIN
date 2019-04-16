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