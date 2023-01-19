CREATE TABLE VEHICULO
(
    idVehiculo          int             primary key auto_increment,
    patente             varchar(6)      not null,
    marca               varchar(100)    not null,
    modelo              varchar(100)    not null,
    precioServicioNeto  int             not null,
    valorIVA            int             not null,
    totalAPagar         int             not null,
    litrosMaletero      int             null,
    cantidadPuerta      int             null,
    largoManillar       int             null,
    estilo              varchar(100)    null
--    ,tipoVehiculo        int             not null -- 1 Auto 2 moto
);

-- crear CRUD para las siguientes tablas:

CREATE TABLE CARGO
(
    idCargo             int             primary key auto_increment,
    nombre              varchar(50)     not null,
    UNIQUE(nombre)
)
CREATE TABLE PERSONAL
(
    idPersona           int             primary key auto_increment,
    idCargo             int             not null,
    rut                 int             not null,
    digito              varchar(1)      not null,
    nombre              varchar(50)     not null,
    apellido            varchar(50)     not null,
    sueldo              int             not null,
    UNIQUE(rut),
    FOREIGN KEY(idCargo)
                    REFERENCES CARGO(idCargo)
)