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
And User can remove offer from favourites
And page is closed

@Test8
Scenario: User can calculate salary
Given User opens pracuj.pl
When User logs in
And User moves to Income page
And User moves to Calculator page
Then User is on Calculator page
And User can calculate basic income
And page is closed

@Test8A
Scenario: User can calculate salary advanced
Given User opens pracuj.pl
When User logs in
And User moves to Income page
And User moves to Calculator Advanced page
Then User is on Calculator Advanced page
And User can calculate advanced income
And page is closed

@Test9
Scenario: User can find first job
Given User opens pracuj.pl
When User logs in
And User moves to First Job page
And User is on First Job page
And page is closed

@Test10
Scenario: User can browse job offers by input
Given User opens pracuj.pl
When User logs in
And User moves to offers
Then User is on Offers page
And User can find offer
And page is closed
