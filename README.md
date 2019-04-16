# TATWIN
Projekt testu automatycznego dla pracuj.pl Selenium + Cucumber

Patryk Rużyło - https://www.pracuj.pl/

1. Logowanie
Jako użytkownik mogę zalogować się do systemu aby mieć dostęp do danych mojego konta.
Użytkownik loguje się do systemu poprzez wybór przycisku “Zaloguj się” w nagłówku strony i podanie zarejestrowanego adresu e-mail oraz przypisanego do niego hasła.
Jeśli użytkownik poda niepoprawne dane podczas logowania, wtedy pojawia się wiadomość błędzie logowania.
Po zalogowaniu następuje przekierowanie na stronę “Rekomendowane oferty”.
2. Profil zawodowy
“Profil zawodowy” pozwala użytkownikowi na zmianę danych osobowych oraz opisanie profilu zawodowego.
Aby przenieść się na stronę “Profilu zawodowego” należy wybrać opcję “Profil zawodowy” z menu po prawej stronie. Tylko zalogowany użytkownik może otworzyć stronę “Profil zawodowy”.
“Profil zawodowy” pozwala zmienić dane osobowe użytkownika.
“Profil zawodowy” pozwala zmienić dane kontaktowe użytkownika.
“Profil zawodowy” pozwala dodać/edytować/usunąć doświadczenie zawodowe użytkownika.
3. Zmiana hasła
Zalogowany użytkownik może zmienić hasło z poziomu sekcji “Ustawienia konta” -> “Konto”.
Aby to zrobić musi podać aktualne hasło oraz nowe hasło.
Po udanej próbie zmiany hasło wiadomość “Hasło zostało zmienione.” jest wyświetlona. Od tej pory podane nowe hasło jest używane do zalogowania się do systemu.
Podanie błędnego aktualnego hasła podczas próby zmiany hasła powoduje wyświetlenie wiadomości “Wprowadzone obecne hasło jest niepoprawne”.
4. Dokumenty
Jako użytkownik mam możliwość wgrania dokumenty (np. CV) na serwery strony, aby później z nich skorzystać.
Aby przenieść się na stronę “CV i inne dokumenty” należy wybrać opcję “CV i inne dokumenty” z menu po prawej stronie. Tylko zalogowany użytkownik może otworzyć stronę “CV i inne dokumenty”.
“CV i inne dokumenty” pozwala na wgranie nowego pliku w dowolnym formacie.
“CV i inne dokumenty” pozwala na ściągnięcie pliku.
“CV i inne dokumenty” pozwala na usunięcie wybranego pliku. Wiadomość “Czy na pewno chcesz usunąć plik <nazwa pliku>?” wyświetlana jest w momencie wybrania opcji usunięcia pliku.
5. Lista oferty pracy
Strona “Oferty pracy” dostępna jest dla wszystkich użytkowników.
Po kliknięciu “Oferty pracy” w głównym menu systemu wyświetlana jest strona ze wszystkimi dostępnymi ofertami pracy.
“Listę ofert pracy” można filtrować ze względu na Kategorię/Poziom stanowiska/Wymiar pracy/Języki/Pozostałe. 
Filtr Kategorie posiada listę kategorii związana z konkretną branżą. Każda z Kategorii (oprócz kategorii “Inne”) posiada Podkategorię. Ilość wybranych podkategorii wyświetlana jest przy filtrze Kategorie po wybraniu konkretnej Kategorii lub poszczególnych Podkategorii.
Z poziomu “Listy ofert pracy“ można wyświetlić wybraną ofertę pracy, zobaczyć profil pracodawcy oraz dodać ofertę do “Zapisanych ofert”.
6. Oferta pracy
Stronę “Oferty pracy” można wyświetlić poprzez kliknęcie na wybranej ofercie pracy z “Listy ofert pracy”.
Strona “Oferty pracy” pozwala na wyświetlenie informacji o pracodawcy.
Strona “Oferty pracy” pozwala na dodanie oferty pracy do “Zapisanych ofert”. Zapisanie oferty z poziomu “Oferty pracy” wyświetla wiadomość “Oferta została usunięta z zapisanych.” na dole ekranu. Usunięcie oferty z “Zapisanych ofert” z poziomu “Oferty pracy” wyświetla wiadomość “Oferta została usunięta z zapisanych.”.
Strona “Oferty pracy” pozwala na wyświetlenie mapy. Mapa wyświetlana jest na stronie oferty jako pop-up. Mapa posiada w nagłówku <nazwę stanowiska>, <nazwę firmy>.
7. Zapisane oferty
“Zapisane oferty” dostępne są tylko dla zarejestrowanych użytkowników poprzez wybranie opcji “Zapisane oferty” z menu po prawej stronie.
Wyświetlenie “Zapisanych ofert” w momencie gdy żadna z ofert nie została dodana do “Zapisach ofert” powodu wyświetlenie komunikatu “W tym miejscu znajdziesz oferty, które oznaczysz gwiazdką. Wróć do nich w dogodnym momencie!” oraz przycisku przenoszącego do strony “Lista ofert pracy”.
Jeśli w “Zapisanych ofertach” znajdują się jakieś oferty, wtedy liczba zapisanych ofert jest wyświetlana wraz z listą zapisanych ofert.
Z poziomu “Zapisanych ofert” użytkownik może aplikować co spowoduje przeniesienie na stronę wybranej “Oferty pracy”.
Z poziomu “Zapisanych ofert” użytkownik może usunąć ofertę z “Zapisanych ofert”.
8. Kalkulator wynagrodzeń
“Kalkulator wynagrodzeń” dostępny jest w sekcji “Narzędzia dla Ciebie” znajdującej się na głównej stronie systemu bądź z poziomu sekcji “Zarobki”, która dostępna jest z głównego menu systemu.
“Kalkulator” posiada dwie wersje: podstawową oraz zaawansowaną.
“Kalkulator podstawowy” pozwala na obliczenie miesięcznej pensji netto lub brutto.
“Kalkulator zaawansowany” pozwala na obliczenie miesięcznej pensji netto lub brutto ze względu na rodzaj umowy oraz dodatkowe opcje.
9. Pierwsza praca
“Pierwsza praca” jest zdefiniowaną stroną z “Listą ofert pracy”, która wybrany ma filtr Poziom Stanowiska. Po wybraniu tej opcji z głównego menu systemu, widoczna jest “Lista ofert pracy” dla Praktykanta/Stażysty/Asystenta.
10. Wyszukiwanie ofert
Użytkownik ma możliwość wyszukiwania ofert pracy po wybranej frazie. Wyszukiwanie może być filtrowane po wybranym mieście lub województwie.
