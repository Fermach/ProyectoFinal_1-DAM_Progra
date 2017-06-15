PRAGMA foreign_keys = ON;


DROP TABLE IF EXISTS jugadores;
CREATE TABLE jugadores(
        login TEXT NOT NULL,
        nombre TEXT,
        apellidos TEXT,
        nivel TEXT,
        nacionalidad TEXT,
PRIMARY KEY(login)
);

DROP TABLE IF EXISTS personajes;
CREATE TABLE personajes (
        nombre TEXT,
        login TEXT NOT NULL,
        tipo TEXT,
        raza TEXT,
        sexo TEXT,
PRIMARY KEY(nombre,login),
FOREIGN KEY(login) REFERENCES jugadores(login) ON UPDATE CASCADE ON DELETE CASCADE 
);


DROP TABLE IF EXISTS historial;
CREATE TABLE historial(
        login TEXT NOT NULL,
        nombre TEXT,
        apellidos TEXT,
        nivel TEXT,
        nacionalidad TEXT,
        fecha_baja TEXT,
PRIMARY KEY(login)
);
