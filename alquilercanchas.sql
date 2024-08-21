CREATE DATABASE IF NOT EXISTS alquilercanchas;

USE alquilercanchas;

CREATE TABLE Canchas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    telefono VARCHAR(15) NOT NULL
);

CREATE TABLE Reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cancha_id INT,
    usuario_id INT,
    fecha DATE NOT NULL,
    hora_inicio TIME NOT NULL,
    horas INT NOT NULL,
    FOREIGN KEY (cancha_id) REFERENCES Canchas(id),
    FOREIGN KEY (usuario_id) REFERENCES Usuarios(id),
    CHECK (hora_inicio BETWEEN '08:00:00' AND '22:00:00'),
    CHECK (horas > 0 AND horas <= 3)
);

INSERT INTO Canchas (nombre) VALUES 
('Cancha 1'),
('Cancha 2'),
('Cancha 3'),
('Cancha 4'),
('Cancha 5');
