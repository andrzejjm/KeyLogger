# KeyLogger
Program korzysta z biblioteki JNativeHook. Pobiera tytuł aktualnie otwartego okna i wszystkie naciśnięte klawisze (NativeKeyEvent).
Dane zapisuje w pliku Log.txt, który znajduje się w tym samym folderze co plik wykonywalny jar (tworzy się automatycznie).
<br>Program symuluje wysyłanie danych na serwer zdalny po wykryciu połączenia z internetem.
Dane wysyłane są co 1 minutę (i usuwane z pliku). W przypadku braku połączenia z internetem, dane nie są kasowane z pliku. 

## Tworzenie pliku wykonywalnego
Do zbudowania projektu nie potrzeba oprogramowania maven. W projekcie znajduje się wrapper, który umożliwia wykonywanie poleceń mavena bez konieczności jego instalacji.
* Czyszczenie projektu
````$xslt
.\mvnw clean:clean
````
* Budowanie projektu
````$xslt
.\mvnw install
````
Stworzony plik ma nazwę keylogger-1.0.jar i znajduje się w foldrze ``.\target``.

## Ukrywanie pliku
W celu ukrycia pliku, możliwe jest umieszczenie go np w folderze domowym i podpisanie jako plik systemowy.
W celu ułatwienia sprawdzania zadania, plik nie został ukryty.

## Komunikacja z Internetem
Aby zdiagnozować połączenie internetowe, program sprawdza dostępność serwera google.com (może to być jakikolwiek inny serwer, na który wysyłane są dane).
<br>Po wykryciu połączenia plik zostaje wyczyszczony, symulując wysyłanie danych na serwer.
<br>Operacja wykonywana jest co 1 minutę.

## Praca w tle
Program ma mozliwośc pracy w tle. Wyłączyć można go z menadżera zadań.

## Autor
<b>Andrzej Miazga
<br>Indeks: 226024</b>