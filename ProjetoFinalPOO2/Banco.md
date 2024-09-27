 ```
create database projetofinal;

use projetofinal;


    -- tabela usuarios
create table usuarios(
id int auto_increment primary key ,
nome varchar(50) not null,
email varchar(50) not null unique,
username varchar(30) not null unique,
senha varchar(50) not null
);

insert into usuarios( nome, email, username, senha)
values('administrador', 'admin@email','admin', 'admin');

select * from usuarios;


    -- tabela clientes
create table clientes(
cliente_id int auto_increment primary key,
nome_cliente varchar(50),
endereco varchar(60),
telefone varchar(9),
email_cliente varchar(60),
cpf_cnpj varchar(14)
);

insert into clientes (nome_cliente, endereco, telefone, email_cliente, cpf_cnpj )
values( 'adm', 'rua 1', '000000000', 'adm@adm', '00000000000000' );

select * from clientes;


    -- tabela agenda
create table agenda(
id_agenda int auto_increment primary key,
data_agenda varchar(6),
hora varchar(4),
descricao varchar(100),
 foreign key (cliente_id) references clientes(cliente_id)
);

INSERT INTO agenda (data_agenda, hora, descricao, cliente_id)
VALUES ('060424', '2300', 'agenda marcada', LAST_INSERT_ID());

select * from agenda;
    ```