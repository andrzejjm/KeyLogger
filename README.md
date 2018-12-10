# KeyLogger
Program korzysta z biblioteki JNativeHook. Pobiera tytuł aktualnie otwartego okna i wszystkie naciśnięte klawisze (NativeKeyEvent).
Dane zapisuje w pliku Log.txt, który znajduje się w tym samym folderze co plik wykonywalny jar (tworzy się automatycznie).
<br>Program symuluje wysyłanie danych na serwer zdalny po wykryciu połączenia z internetem.
Dane wysyłane są co 1 minutę (i usuwane z pliku). W przypadku braku połączenia z internetem, dane nie są kasowane z pliku. 

## Tworzenie pliku wykonywalnego
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

## Praca w tle
Program ma mozliwośc pracy w tle. Wyłączyć można go z menadżera zadań.