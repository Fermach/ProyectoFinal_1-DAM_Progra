CREATE VIEW mostrar_guerreros AS select * from personajes where tipo='guerrero';
CREATE VIEW mostrar_magos AS select * from personajes where tipo='mago';
CREATE VIEW mostrar_picaros AS select * from personajes where tipo='picaro';
CREATE VIEW mostrar_jugadores_con_mas_nivel AS select * from jugadores where nivel='alto';


CREATE TRIGGER borrado BEFORE DELETE
ON jugadores
BEGIN
INSERT INTO historial (login, nombre, apellidos, nivel, nacionalidad, fecha_baja)
VALUES (old.login, old.nombre, old.apellidos, old.nivel, old.nacionalidad, datetime('now'));
END;
CREATE TRIGGER personajeNuevo BEFORE INSERT
ON jugadores
BEGIN
INSERT INTO personajes (nombre,login, tipo, raza, sexo)
VALUES ("", new.login, "", "", "");
END;

