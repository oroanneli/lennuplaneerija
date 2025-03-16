# Lennuplaneerija
CGI suvepraktikale kandideerimise ülesanne

## Veebirakenduse käivitamine
1. Kõigepealt tuleb kloonida see repositoorium
2. Veebirakenduse käivitamiseks luua endale MySQL andmebaas nimega lennuplaneerija ning luua sinna tabel käsuga:
```
CREATE TABLE `lennud` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `sihtkoht` varchar(255) NOT NULL,
  `lähtekoht` varchar(255) DEFAULT NULL,
  `kuupaev` varchar(255) DEFAULT NULL,
  `kellaaeg` varchar(255) DEFAULT NULL,
  `hind` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
```
3. Andmete sisestamiseks tuleb need importida failist lennud.csv
4. Faili application-example.yml baasil luua fail application.yml kus #kasutajanimi ja #parool vahetada enda omade vastu
5. Käivitada fail LennuplaneerijaApplication.java ning avada browserist [localhost:8080](http://localhost:8080/)

### Arendustöö

Kuna ma polnud kunagi varem Spring Booti kasutanud, siis oli see ülesanne minu jaoks kindlasti õppeprotsess ja paras katsumus. Alguses ülesandele otsa vaadates oli küll selline tunne, et ei oska isegi kuskilt peale hakata. Õnneks on internetis palju õpetusi, mille abil sain aru, et mida teha ning kuidas ülesande lahendamisele läheneda. Projekt ei ole kindlasti täiuslik, kuid olen uhke, et selle tehtud sain. Mul on hea meel, et kuigi ülesanne tundus alguses keeruline ja hirmutav tegin selle siiski lõpuni ning läbi selle oli mul võimalus õppida ja areneda ka väljaspool kohustuslikku õppekava.
