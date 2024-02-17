drop schema if exists user_db;

create schema user_db;
use user_db;

drop table if exists userdata;
drop table if exists address;

create table address(
    address_id int auto_increment,
    street varchar(30) not null,
    street_2 varchar(20),
    city varchar(30) not null,
    state varchar(2) not null,
    zip int not null,
    constraint ps_addressid_pk primary key (address_id)
);

insert into address values(1000, '7500 Old Dominion Ct', null, 'Aptos', 'CA', 95003);
insert into address values(1001, '615 Gilroy Dr', 'Apt 1', 'Capitola', 'CA', 95010);
insert into address values(1002, '15 Blake Ln', null, 'Scotts Valley', 'CA', 95066);

create table userdata(
    user_id int auto_increment,
    address_id int unique,
    first_name varchar(15) not null,
    last_name varchar(15) not null,
    email varchar(40) not null,
    password varchar(10) not null,
    phone_number bigint not null,
    constraint ps_userid_pk primary key (user_id),
    constraint ps_user_address_fk foreign key(address_id) references address(address_id)
);


insert into userdata values(2000, 1000, 'Chad', 'Smith', 'chad.smith@gmail.com', 'Chad@12345', 8313181182);
insert into userdata values(2001, 1001, 'Reis', 'Taylor', 'reis.taylor@gmail.com', 'Reis@12345', 8314718141);
insert into userdata values(2002, 1002, 'Nathan', 'Matteson', 'nathan.matteson@gmail.com', 'Nathan@123', 5107489820);

select * from address;
select * from userdata;
