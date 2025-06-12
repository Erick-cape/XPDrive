Codigo para gerar o banco de dados:

create DATABASE XPdrive;

use XPdrive;

create table Produtos (
	id int auto_increment primary key,
	nome varchar (50) not null,
	tipo varchar (30) not null,
	valor double not null,
    quantidade int not null
);
