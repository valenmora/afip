#drop database afip;

#drop table contribuyente;
#drop table impuesto;
#drop table contribuyente_impuesto;

create database afip;
USE afip;

create table contribuyente 
(
	idcontribuyente int not null auto_increment,
    nombre varchar(20),
    apellido varchar(20),
    dni long,
    clavefiscal varchar(10),
    primary key (idcontribuyente)
);

create table impuesto 
(
	idimpuesto int not null auto_increment,
    nombreimpuesto varchar(30),
    porcentaje varchar(20),
    fechaliq date,
    primary key (idimpuesto)
);

create table contribuyente_impuesto 
(
	idimpuesto int ,
    idcontribuyente int,
    foreign key (idimpuesto) references impuesto (idimpuesto),
    foreign key (idcontribuyente) references contribuyente (idcontribuyente)
);

INSERT INTO `impuesto` (`nombreimpuesto`, `porcentaje`, `fechaliq`) VALUES ("Ganancias", 5, '2020-01-13');
INSERT INTO `impuesto` (`nombreimpuesto`, `porcentaje`, `fechaliq`) VALUES ("Valor Agregado (IVA)", 21, '2020-01-20');
INSERT INTO `impuesto` (`nombreimpuesto`, `porcentaje`, `fechaliq`) VALUES ("Ganancia Minima Presunta", 10 ,'2020-02-13');
INSERT INTO `impuesto` (`nombreimpuesto`, `porcentaje`, `fechaliq`) VALUES ("Bienes Personales", 15, '2020-04-2');
INSERT INTO `impuesto` (`nombreimpuesto`, `porcentaje`, `fechaliq`) VALUES ("Debitos y Creditos Bancarios", 2 ,'2020-03-26');
INSERT INTO `impuesto` (`nombreimpuesto`, `porcentaje`, `fechaliq`) VALUES ("Ingresos Brutos", 4, '2020-01-20');
INSERT INTO `impuesto` (`nombreimpuesto`, `porcentaje`, `fechaliq`) VALUES ("Al Sello", 10 ,'2020-05-02');
INSERT INTO `impuesto` (`nombreimpuesto`, `porcentaje`, `fechaliq`) VALUES ("Transferencia de Inmuebles", 20, '2020-03-20');



select * from impuesto;