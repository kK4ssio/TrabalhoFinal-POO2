´´´

-- Criar o banco de dados
CREATE DATABASE finalproj;

USE finalproj;

-- Tabela usuarios
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    username VARCHAR(30) NOT NULL UNIQUE,
    senha VARCHAR(50) NOT NULL
);

-- Descrever tabela usuarios
DESCRIBE usuarios;

-- Inserir dados na tabela usuarios
INSERT INTO usuarios (nome, email, username, senha)
VALUES ('administrador', 'admin@email.com', 'admin', 'admin');

-- Selecionar todos os dados da tabela usuarios
SELECT * FROM usuarios;

-- Alterar dados
UPDATE usuarios SET nome = ?, email = ?, username = ?, senha = ? WHERE id = ?;

-- Deletar dados
DELETE FROM usuarios WHERE id = ?;

-- Tabela clientes
CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome_cliente VARCHAR(50) NOT NULL,
    endereco VARCHAR(60) NOT NULL,
    telefone VARCHAR(9) NOT NULL,
    email_cliente VARCHAR(60) NOT NULL,
    cpf_cnpj VARCHAR(14) NOT NULL
);

-- Descrever tabela clientes
DESCRIBE clientes;

-- Inserir dados na tabela clientes
INSERT INTO clientes (nome_cliente, endereco, telefone, email_cliente, cpf_cnpj)
VALUES ('adm', 'rua 1', '000000000', 'adm@adm.com', '00000000000');

-- Selecionar todos os dados da tabela clientes
SELECT * FROM clientes;

-- Deletar dados
DELETE FROM clientes WHERE id_cliente = ?;

-- Alterar dados
UPDATE clientes SET nome_cliente = ?, endereco = ?, telefone = ?, email_cliente = ?, cpf_cnpj = ? WHERE id_cliente = ?;

-- Tabela agenda
CREATE TABLE agenda (
    id_agenda INT AUTO_INCREMENT PRIMARY KEY,
    data_agenda VARCHAR(6),
    hora VARCHAR(4),
    descricao VARCHAR(100),
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id_cliente)
);

-- Inserir dados na tabela agenda
INSERT INTO agenda (data_agenda, hora, descricao, cliente_id)
VALUES ('060424', '2300', 'agenda marcada', ?);

-- Selecionar todos os dados da tabela agenda
SELECT * FROM agenda;
