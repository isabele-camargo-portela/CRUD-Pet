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


-- inserts 

insert into cliente (nome, cpf, data_nascimento, telefone, endereco, bairro, cidade, estado, cep, status)
values
    ('ana silva', '12345678909', '1998-03-15', '12991234567', 'rua das flores, 120', 'centro', 'sao jose dos campos', 'sp', '12210000', true),
    ('bruno santos', '23456789092', '2001-07-22', '12987654321', 'rua brasil, 450', 'jardim america', 'sao jose dos campos', 'sp', '12235000', true),
    ('carla oliveira', '34567890175', '1995-11-08', '12993456789', 'avenida paulista, 80', 'vila adyana', 'sao jose dos campos', 'sp', '12243000', true),
    ('diego costa', '45678901249', '2003-01-30', '12994567890', 'rua primavera, 210', 'satellite', 'sao jose dos campos', 'sp', '12230000', true),
    ('elisa ferreira', '56789012303', '1999-09-12', '12995678901', 'rua das acacias, 75', 'jardim satelite', 'sao jose dos campos', 'sp', '12231000', true);

insert into raca (nome_raca, tipo_animal, status)
values
    ('labrador', 'cachorro', true),
    ('golden retriever', 'cachorro', true),
    ('poodle', 'cachorro', true),
    ('shih tzu', 'cachorro', true),
    ('persa', 'gato', true),
    ('siames', 'gato', true),
    ('maine coon', 'gato', true),
    ('angora', 'gato', true);

insert into animal (nome, data_nascimento, sexo, cor, observacoes, id_cliente, id_raca, status)
values
    ('thor', '2020-05-10', 'M', 'dourado', 'brincalhao e agitado', 1, 1, true),
    ('mel', '2022-03-18', 'F', 'creme', 'muito docil', 1, 2, true),
    ('rex', '2019-07-22', 'M', 'caramelo', 'gosta de passear', 2, 3, true),
    ('luna', '2021-11-05', 'F', 'branco', 'calma e tranquila', 2, 4, true),
    ('nina', '2023-01-12', 'F', 'cinza', 'gosta de dormir', 3, 5, true),
    ('simba', '2020-09-20', 'M', 'marrom', 'muito curioso', 3, 6, true),
    ('apolo', '2018-04-15', 'M', 'preto', 'porte grande', 4, 7, true),
    ('belinha', '2022-12-25', 'F', 'branco', 'muito carinhosa', 4, 8, true),
    ('cookie', '2021-06-08', 'M', 'caramelo', 'gosta de brincar', 5, 1, true),
    ('mimi', '2024-02-14', 'F', 'branco e cinza', 'filhote bastante ativo', 5, 5, true);





    