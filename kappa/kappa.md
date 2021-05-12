# Spring Framework -- Gyakorlat [Kappa]

###### A gyakorlat 2 részből fog összetevődni:

- **Feladatok**, amik megoldásra várnak. Ezeknél mindenki azonos projekten fog dolgozni egyéniben és a gyakorlat folyamán a saját kódbázist bővítjük csak.
	- Projektet `git` alatt szükséges csinálni.
	- Minden további nélkül használhatsz - általam nem kért - függőségeket is.
	- Minden olyan feladat, amit még nem tanultatok elméleten vagy én nem mutattam meg, az kihagyható. Persze ez nem azt jelenti, hogy nem próbálkozhatsz. ;)
	Ezt a programban a megvalósítás helyén egy `// TODO: <message>`-el tudod jelezni. Pl.: `// TODO: Hibernate-ről még nem tanultunk.`


- **Megválaszolandók**, amiket első sorban Önmagadnak kell megválaszolni. Kérdés: "Mi történik, ha ezt csinálom vagy ezt kapja?" Ennek a célja, hogy értsünk minden olyan működést, amik a Spring szemantikája szerint helyes, de mégsem azt csinálja, amit elvárunk tőle vagy nem úgy. Több órás debugolástől megtud menteni. :)
	- Ezeket a program részeket nem szükséges commitálnod a git-be.
	- Elegendő, ha komment formájában van nyoma, de ez sem kötelező.
	- Szúró próba szerűen rákérdezhetek egyes dolgokra. Ha olyat kérdezek, amit nem tudsz, próbáld ki. :)


###### Spring témában keresel több forrás áll a rendelkezésedre:
- [Baeldung](https://www.baeldung.com/) cikkei nagyon jók.
- [Spring Framework Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/)
- YouTube
- Framework forráskód kommentek
- egyéb blogok
- Ha úgy döntenél, hogy nem kérdezel (kollégától vagy mentortól) és magad akarod mindenáron megoldani - csak azért is -, akkor javaslom a [StackOverflow](https://stackoverflow.com/)-t

## 1. Gyakorlat -- 2021.05.12.


### Beszélgessünk
- Spring komponensek
- Projekt struktúra
- Request folyam

### Feladatok
#### 0 -- Előkészítés
##### # 0.1 -- Init
- Inicializálj egy Spring Boot projektet [innen](https://start.spring.io/).
- **Rajtad áll:** Maven vagy Gradle.
- **Rajtad áll:** Java, Kotlin vagy Groovy
- **Metadata:**
  - **Group:** hu.flowacademy
  - **Artifact:** kappa
- **Spring verzió:** legfrissebb. Ne legyen (...) zárójeles része.
- **Java verzió:** 11
- **Package:** jar

##### # 0.2 -- Git
Kicsomagolás után készíts egy repository-t és kösd össze egy remote repository-val (pl. GitHub).

**Hint:** IDE számos dolgot támogat git terén! Előfordul, hogy ezért-azért command line-hoz kell nyúlni.

##### # 0.3 -- Nem feladat! Csak olvasd el, nincs feladat. Rizsa incoming.
Egy sok boltot üzemeltető vállalat megkér, hogy készíts el neki egy szerveralkalmazást. Jelenleg rendelkezik egy FrontEnd-es csapattal *(tehát UI témakör nincs)*. Ez a webfelület, a mi API end-pointjainkat hívná, ami nyilván jelenleg nincs.

Ezt kéne megvalósítani:
- Egy FrontEnd kódbázis van és globális, azaz mindegyiknek ugyanazt a kódbázist futtatja ugyanazzal az UI-al. Azaz külömbséget kell tudnunk tenni bolt és bolt között.
- Egy adott boltban árult termékek ne keveredjenek a másik boltéval.
- Ha egy vásárló regisztrál, az bármelyik boltból tudjon vásárolni.

Gyakorlat alatt ezt az alkalmazást írjuk meg és jutunk ameddig jutunk. További CR-ek (Change Request - Változtatási kérelem) is jöhetnek. Jelenlegi állás szerint bemutatni nem szükséges. Projekt célja, hogy ne csak feladatokat oldjunk meg, hanem valamit építsünk is és esetleges megvalósítási ötletet adjon. Ha olyan ötleted lenne, amivel hatékonyabban tudnád megvalósítani, akkor oszd meg velem (Donáttal) azt és a képzeletbeli FrontEnd csapat akár módosít a kódján, így szabad utat adva az ötletednek.
