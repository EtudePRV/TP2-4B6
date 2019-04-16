


CREATE TABLE artistes (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nom varchar(100),
  membre tinyint(1),
  photo varchar(255)
);

CREATE TABLE genres (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  nom varchar(255) NOT NULL
);

CREATE TABLE users (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  name varchar(255) NOT NULL,
  password varchar(255) NOT NULL
);

CREATE TABLE albums (
  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
  titre varchar(255),
  idGenre INTEGER,
  annee varchar(255),
  image varchar(255),
  idArtise INTEGER,
  FOREIGN KEY(idGenre) REFERENCES genres(id)
  FOREIGN KEY(idArtise) REFERENCES artistes(id)
);