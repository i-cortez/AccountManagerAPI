drop schema if exists user_db;

create schema user_db;
use user_db;

drop table userdata;

create table userdata(
    user_id int primary key auto_increment,
    user_name varchar(10) not null,
    password varchar(10) not null,
    phone_number bigint not null,
    city varchar(20) not null
);

insert into userdata values(2000, 'Chris', 'Chris12345', 8313181182, 'Aptos');
insert into userdata values(2001, 'Rick', 'Rick12345', 8314718141, 'Santa Cruz');
insert into userdata values(2002, 'Nathan', 'Nathan12345', 5106909080, 'Hayward');

select * from userdata;
