create table pacientes(

    id bigint not null auto_increment,
    pacte_nome varchar(100) not null,
    pacte_email varchar(100) not null unique,
    pacte_telefone varchar(20) not null,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero varchar(20),
    uf char(2) not null,
    cidade varchar(100) not null,
    pacte_ativo tinyint,

    primary key(id)

);