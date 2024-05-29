-- Borrado de la base de datos
DROP DATABASE IF EXISTS practica_intermodular;
/*drop table if exists Estrella ;
drop table if exists Planeta ;
drop table if exists Satelite ;*/
-- Creación de la base de datos
CREATE DATABASE practica_intermodular;
USE practica_intermodular;

-- Creación de tablas

-- Tabla Estrella
CREATE TABLE Estrella (
    nombre VARCHAR(50) PRIMARY KEY,
    tipo VARCHAR(10) NOT NULL,
    radio DECIMAL(10,1) NOT NULL,
    temperatura DECIMAL(10,1) NOT NULL,
    distancia DECIMAL(10,1) NOT NULL,
    composicion VARCHAR(100) NOT NULL,
    fecha_creacion DATE
);

-- Tabla Planeta
CREATE TABLE Planeta (
    nombre VARCHAR(50) PRIMARY KEY,
    radio DECIMAL(10,1) NOT NULL,
    distancia_sol DECIMAL(10,1) NOT NULL,
    periodo_orbital INT NOT NULL,
    temperatura DECIMAL(10,1) NOT NULL,
    tipo VARCHAR(20) NOT NULL,
    numero_satelites INT DEFAULT 0,
    fecha_creacion DATE,
    estrella varchar(20),
    FOREIGN KEY (estrella) REFERENCES Estrella(nombre)
);

-- Tabla Satelite
CREATE TABLE Satelite (
    nombre VARCHAR(50) PRIMARY KEY,
    planeta VARCHAR(50) NOT NULL,
    radio DECIMAL(10,1) NOT NULL,
    distancia_planeta DECIMAL(10,1) NOT NULL,
    periodo_orbital DECIMAL(10,1) NOT NULL,
    temperatura DECIMAL(10,1) NOT NULL,
    tipo VARCHAR(20) NOT NULL,
    fecha_creacion DATE ,
    FOREIGN KEY (planeta) REFERENCES Planeta(nombre)
);

-- Creación de los triggers para establecer la fecha de creación
DELIMITER //
CREATE TRIGGER fecha_creacion_estrella
BEFORE INSERT ON Estrella
FOR EACH ROW
BEGIN
SET NEW.Fecha_Creacion = sysdate(); -- Le da formato
 
END;
//
CREATE TRIGGER fecha_creacion_planeta
BEFORE INSERT ON Planeta
FOR EACH ROW
BEGIN
  SET NEW.Fecha_Creacion = sysdate();
END;
//
CREATE TRIGGER fecha_creacion_satelite
BEFORE INSERT ON Satelite
FOR EACH ROW
BEGIN
  SET NEW.Fecha_Creacion = sysdate();
END;
//
-- Creación del trigger para actualizar el número de satélites en la tabla Planetas
CREATE TRIGGER actualiza_num_satelites
AFTER INSERT ON Satelite
FOR EACH ROW
BEGIN
  DECLARE num_satelites INT;
  -- Contar el número de satélites del planeta
  SELECT COUNT(*) INTO num_satelites FROM Satelite WHERE Planeta = NEW.Planeta;
  --  SET num_satelites = num_satelites + 1 WHERE nombre = NEW.nombre; otra forma de hacerlo
  -- Actualizar el número de satélites en la tabla Planetas
  UPDATE Planeta
  SET numero_satelites = num_satelites WHERE Nombre = NEW.Planeta;
END;
//
DELIMITER ;
-- Inserción de datos

-- Estrella
INSERT INTO Estrella (nombre, tipo, radio, temperatura, distancia, composicion)
VALUES ('Sol', 'G2V', 696340.0, 5500.0, 149.6, '74% Hidrógeno, 24% Helio, 2% Otros');

-- Planetas
INSERT INTO Planeta (nombre, radio, distancia_sol, periodo_orbital, temperatura, tipo)
VALUES ('Mercurio', 2439.7, 57.9, 88, 167, 'Rocoso'),
       ('Venus', 6051.8, 108.2, 225, 464, 'Rocoso'),
       ('Tierra', 6371.0, 149.6, 365, 15, 'Rocoso'),
       ('Marte', 3389.5, 227.9, 687, -65, 'Rocoso'),
       ('Júpiter', 69911.0, 778.5, 4333, -110, 'Gaseoso'),
       ('Saturno', 58232.0, 1429.4, 10759, -140, 'Gaseoso'),
       ('Urano', 25362.0, 2870.9, 30687, -195, 'Gaseoso'),
       ('Neptuno', 24622.0, 4498.3, 60190, -200, 'Gaseoso');

-- Satélites
INSERT INTO Satelite (nombre, planeta, radio, distancia_planeta, periodo_orbital, temperatura, tipo)
VALUES ('Luna', 'Tierra', 1737.4, 384400.0, 27.3, -53, 'Sólido/Rocoso'),
       ('Fobos', 'Marte', 11.1, 9378.0, 0.3, -40, 'Sólido/Rocoso'),
       ('Deimos', 'Marte', 6.2, 23460.0, 1.3, -40, 'Sólido/Rocoso'),
       ('Ío', 'Júpiter', 1821.6, 421700.0, 1.8, -143, 'Sólido/Rocoso'),
       ('Europa', 'Júpiter', 1560.8, 670900.0, 3.5, -160, 'Sólido/Hielo'),
       ('Ganimedes', 'Júpiter', 2634.1, 1070400.0, 7.2, -163, 'Sólido/Hielo'),
       ('Calisto', 'Júpiter', 2410.3, 1882700.0, 16.7, -139, 'Sólido/Hielo'),
       ('Titán', 'Saturno', 2575.5, 1222000.0, 15.9, -179, 'Sólido/Hielo'),
       ('Encélado', 'Saturno', 252.1, 238000.0, 1.4, -201, 'Sólido/Hielo'),
       ('Titania', 'Urano', 788.4, 435900.0, 8.7, -203, 'Sólido/Hielo'),
       ('Oberón', 'Urano', 761.4, 583500.0, 13.5, -203, 'Sólido/Hielo');