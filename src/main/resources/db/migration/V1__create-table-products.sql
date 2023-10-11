create table products(

    id bigint not null auto_increment,
    name varchar(50) not null,
    description varchar(255),
    price DECIMAL(10,2) not null,
    type varchar(20) not null,

    primary key(id)

);