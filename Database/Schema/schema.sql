create database CrudPet;

use CrudPet;

create database crud_pet;

use crud_pet;

create table cliente (
    id_cliente int auto_increment primary key,
    nome varchar(100) not null,
    cpf varchar(14) not null unique,
    data_nascimento date,
    telefone varchar(20),
    endereco varchar(150),
    bairro varchar(80),
    cidade varchar(80),
    estado char(2),
    cep varchar(10),
    status boolean default true
);

create table raca (
    id_raca int auto_increment primary key,
    nome_raca varchar(80) not null,
    tipo_animal varchar(20) not null,
    status boolean default true,
    unique (nome_raca, tipo_animal)
);

create table animal (
    id_animal int auto_increment primary key,
    nome varchar(100) not null,
    data_nascimento date,
    sexo char(1),
    cor varchar(50),
    observacoes varchar(255),
    id_cliente int not null,
    id_raca int not null,
    status boolean default true,
    constraint fk_animal_cliente foreign key (id_cliente) references cliente(id_cliente),
    constraint fk_animal_raca foreign key (id_raca) references raca(id_raca)
);


-- trigger

delimiter $$

create trigger trg_desativar_animais_cliente
after update on cliente
for each row
begin
    if old.status = true and new.status = false then

        update animal
        set status = false
        where id_cliente = new.id_cliente;

    end if;
end $$

delimiter ;


delimiter $$

create trigger trg_desativar_animais_raca
after update on raca
for each row
begin
    if old.status = true and new.status = false then

        update animal
        set status = false
        where id_raca = new.id_raca;

    end if;
end $$

delimiter ;


