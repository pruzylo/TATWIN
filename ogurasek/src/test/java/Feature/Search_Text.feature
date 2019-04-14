Feature: Feature File

Scenario: User can log in
Given User opens pracuj
When User clicks on login
And User provides credentials
And User clicks on login button
Then user is logged in



Scenario: User moze zmienic dane osobowe oraz edytowac profil
Given User otwiera pracuj.pl i loguje się
When User sie loguje
And User wchodzi w profil zawodowy
Then profil zawodowy