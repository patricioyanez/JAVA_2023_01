CREATE TABLE VEHICULO
(
    idVehiculo         int             primary key auto_increment,
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
);