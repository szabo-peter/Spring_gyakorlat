# 1. Gyakorlat -- 2021.05.12.


## Beszélgessünk
- Spring komponensek
- Projekt struktúra
- Request folyam

## Feladatok

### Modellek
```typescript
interface Shop {
	id: string
	name: string
	category: string
	settlement: string
	zip: string
	address: string
}

interface ShopModel {
	name: string
	category: string
	settlement: string
	zip: string
	address: string
}

// boltban vásárolható termék
interface Item {
	name: string
	price: number
}
```

### EndPoint-ok

#### Boltok listája
- **Request - HTTP Method:** GET
- **Request - EndPoint:** /api/v1/shop
- **Response - Status Code:** `OK`
- **Response - Body:** `Shop[]`

#### Egy adott bolt lekérdezése
- **Request - HTTP Method:** GET
- **Request - EndPoint:** /api/v1/shop/`id`
- **Response - Status Code:** `OK` / `NOT FOUND`
- **Response - Body:** `Shop` / `null`

#### Bolt feltöltése
- **Request - HTTP Method:** POST
- **Request - EndPoint:** /api/v1/shop/
- **Request - Body:** `ShopModel`
- **Response - Status Code:** `NO CONTENT` / `BAD REQUEST`

#### Bolt törlése
- **Request - HTTP Method:** DELETE
- **Request - EndPoint:** /api/v1/shop/`id`
- **Response - Status Code:** `NO CONTENT`

#### Termékek lekérdezése
- **Request - HTTP Method:** GET
- **Request - EndPoint:** /api/v1/item
- **Request - Header:** `X-SHOP: <Shop ID>`
- **Response - Status Code:** `OK`
- **Response - Body:** `Item[]`

##### Termék feltöltése
- **Request - HTTP Method:** POST
- **Request - EndPoint:** /api/v1/item
- **Request - Header:** `X-SHOP: <Shop ID>`
- **Request - Body:** `Item`
- **Response - Status Code:** `NO CONTENT`

### Kérdések
- Ha POST Request, hogyan reagál a következőkre?
	- Egy mező hiányzik. Pl.: Bolt feltöltése request json-ben nem szerepel a bolt neve.
	- Egy olyan adat kerül beküldésre a megkövetelteken túl, amit a modellünk nem támogat? Pl.: Bolt feltöltése request json-ben további adat szerepel, pl. adoszam.
- A rendszered egy harmadik fél is használja, de a megkövetelt adatokon túl további adatokat is küld. Okoz valami hibát? Ha igen, hogy orvosolnád?
- Hogyan tudnánk újra felhasználni a `Shop` modelt a `ShopModel` helyett?
- Ha `Bolt törlése` kérés esetén az `id` lehet egyáltalán `int` típus? Ha igen, mondjuk `int` vár, akkor mi történik, ha `String` adatot kap? Próbáljuk ki a következő inputra:
	- DELETE /api/v1/shop/10
	- DELETE /api/v1/shop/almafa
- Ha URL-ben szerepel "10" és "almafa", akkor minden URL érték `String`? Lehet `Float` vagy `Double`? Netán `UUID`?
