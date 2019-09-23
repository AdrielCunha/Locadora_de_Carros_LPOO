create database Locadora;

use Locadora;

create table Cliente(
IDCliente int key auto_increment,
Nome varchar(100),
CNH char(14),
CPF char(14),
Data_nascimento date,
Rua varchar(50),
Numero char(5),
Bairro varchar(50),
CEP char(9),
UF char(2),
Cidade varchar(50),
Complemento varchar(50));

create table Carro(
IDCarro int key auto_increment,
Marca char(50),
Modelo char(50),
NumeroChassi char(12),
Placa char(8),
PrecoDiaria float(10,2),
Cor varchar(50),
ValorIPVA float(10,2),
ValorSeguro float(10,2));

create table funcionario(
IDFuncionario int key auto_increment,
Nome varchar(100),
CNH char(11),
CPF char(14),
RG char(10),
DataNascimento date,
Rua varchar(50),
Numero char(5),
Bairro varchar(50),
CEP char(9),
UF char(2),
Cidade varchar(50),
Complemeto varchar(50),
Cargo varchar(50),
Salario float(10,2));


create table Locacao(
IDLocacao int key auto_increment,
IDCliente int,
IDCarro int,
IDFuncionario int,
EntregaCarro char(10),
MetodosPag varchar(50),
NumeroParcelas varchar(50),
Total float(10,2),
foreign key (IDCliente) references Cliente(IDCliente),
foreign key (IDCarro) references Carro(IDCarro),
foreign key (IDFuncionario) references Funcionario(IDFuncionario));