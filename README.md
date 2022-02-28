# Átlaggal szorzás
## Bevezetés
Ebben a feladatban egy metódust kell létrehoznod, ami egy tömböt dolgoz fel.

A `main` metódusban próbálhatod ki a kódodat, illetve használd
az előre megírt teszteseteket az algoritmusod kipróbálására!
A kiadott teszt eseteken ne módosíts!

## Feladatleírás

Írj egy metódust a `hu.nive.ujratervezes.addaverage.AddAverage` osztályban a következő specifikácó alapján:

- a metódus neve: `addAverage`
- a metódus bemeneti paraméterei:
    - `numbers`, egy egész számokat tartalmazó tömb `int[]`
    - `n`, egy egész szám `int`
- visszatérési értéke:
  - egy új, egész számokat tartalmazó tömb `int[]`

Az `addAverage` metódus:
Megkeresi az átlag értéket a `numbers` tömben, (az átlag legyen egész, eredménye az egész osztásnak!). Visszaad egy
tömböt amire a következő igaz:

- minden `n`-edik elem a `numbers` tömb azonos indexén található elem és az átlag **szorzata**.
- a többi elem a `numbers` tömb azonos indexén található elemel egyezik.

A beépített `sort()`,`min()`, `max()`, `average()`, stb... metódusok használata a feladat megoldása során nem megengedet.

Kivételkezelés:

- ha a metódust úgy hívjuk meg, hogy a `numbers` paraméter egy üres tömb, akkor adjon vissza egy új, üres tömböt
- ha a metódust úgy hívjuk meg, hogy a `numbers` paraméter értéke `null`, akkor dobjon `IllegalArgumentException`-t
- ha a metódust úgy hívjuk meg, hogy az `n` paraméter értéke kisebb, mint `1`, akkor dobjon `IllegalArgumentException`-t

## Példák

| `numbers`           | `Átlag` | `n`  | Eredmény                   |
|---------------------|:-------:|------|:---------------------------|
| `[-2, -1, 0, 1, 2]` |    0    | `2`  | `[-2, 0, 0, 0, 2]`         |
| `[3, 1, 5, 3, 4]`   |    3    | `1`  | `[9, 3, 15, 9, 12]`        |
| `[2, 12]`           |    7    | `2`  | `[2, 84]`                  |
| `[]`                |    -    | `1`  | `[]`                       |
| `null`              |    -    | `1`  | `IllegalArgumentException` |
| `[2, 12]`           |    -    | `0`  | `IllegalArgumentException` |
| `[2, 12]`           |    -    | `-1` | `IllegalArgumentException` |
