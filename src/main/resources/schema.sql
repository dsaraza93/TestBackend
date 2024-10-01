CREATE TABLE articulo (
                          id VARCHAR(10) NOT NULL,
                          nombre VARCHAR(20),
                          descripcion VARCHAR(200),
                          precio DECIMAL(10, 2),
                          modelo VARCHAR(10),
                          PRIMARY KEY (id)
);
