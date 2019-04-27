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
Scenario: User can upload documents
Given User opens pracuj.pl
When User logs in
Then User moves to documents
And User is on Documents page
And User can delete document
And page is closed

@Test5
Scenario: User can browse job offers
Given User opens pracuj.pl
When User logs in
And User moves to offers
Then User is on Offers page
And User can filter
And page is closed

@Test6
Scenario: User can choose offer
Given User opens pracuj.pl
When User logs in
And User moves to offers
Then User is on Offers page
And User can add offer to favourites
And page is closed

@Test7
Scenario: User can browse saved offers
Given User opens pracuj.pl
When User logs in
And User moves to favourites
Then User is on Favourites page