CREATE DATABASE bd2_blas;
USE bd2_blas;

CREATE TABLE proveedores (
     id INT AUTO_INCREMENT PRIMARY KEY,
     nombre_proveedor VARCHAR(100) NOT NULL,
     direccion VARCHAR(150),
     apoderado_legal VARCHAR(100)
);

CREATE TABLE productos (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nombre_producto VARCHAR(100) NOT NULL,
       cantidad INT NOT NULL,
       precio_unitario DECIMAL(10,2) NOT NULL,

       proveedor_id INT,
       CONSTRAINT fk_proveedor
           FOREIGN KEY (proveedor_id)
               REFERENCES proveedores(id)
);
-- proveedores
INSERT INTO proveedores (nombre_proveedor, direccion, apoderado_legal)
VALUES
    ('Proveedor Uno', 'Av. Lima 123', 'Juan Torres'),
    ('Proveedor Dos', 'Jr. Piura 450', 'María Silva'),
    ('Proveedor Tres', 'Calle Cusco 200', 'Luis Paredes');

-- productos
INSERT INTO productos (nombre_producto, cantidad, precio_unitario, proveedor_id)
VALUES
    ('Laptop Gamer', 10, 4500.00, 1),
    ('Mouse Inalámbrico', 50, 80.00, 2),
    ('Teclado Mecánico', 30, 150.00, 3);