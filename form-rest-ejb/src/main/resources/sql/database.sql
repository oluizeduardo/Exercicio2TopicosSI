create table clientes (
id integer not null,
name varchar(50) not null,
email varchar(50) not null,
constraint pk_products primary key (id)
);
create sequence seq_clientes;

select * from clientes;

insert into clientes (id, name, email)
values (nextval('seq_clientes'), 'Matheus', 'matheus_lemes1996@hotmail.com');
insert into clientes (id, name, email)
values (nextval('seq_clientes'), 'Mateus', 'seraomateus@hotmail.com');
insert into clientes (id, name, email)
values (nextval('seq_clientes'), 'Fabiano', 'fabiano.lomonaco.junior@gmail.com');