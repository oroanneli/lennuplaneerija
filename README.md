# Lennuplaneerija
CGI suvepraktikale kandideerimise ülesanne

## Veebirakenduse käivitamine
1. Kõigepealt tuleb kloonida see repositoorium
2. Veebirakenduse käivitamiseks luua endale MySQL andmebaasi tabel käsuga:
```
CREATE TABLE `lennud` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `sihtkoht` varchar(255) NOT NULL,
  `lähtekoht` varchar(255) DEFAULT NULL,
  `kuupaev` varchar(255) DEFAULT NULL,
  `kellaaeg` varchar(255) DEFAULT NULL,
  `hind` double DEFAULT NULL,
  `kuupäev` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
```
3. Andmete sisestamiseks tuleb need importida failist lennud.csv
4. Faili application-example.yml baasil luua fail application.yml kus #kasutajanimi ja #parool vahetada enda omade vastu
5. Käivitada fail LennuplaneerijaApplication.java ning avada browserist [localhost:8080](http://localhost:8080/)
