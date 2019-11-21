create database bh18db;
use bh18db;

create table emloyees(
id int auto_increment primary key,
name varchar(58) unique not null,
age int default 20 check (age > 0),
`sex` boolean,
 `birthday` date default '2019-02-15',
 speciality varchar(56)
);
 -- drop table emloyees;
 -- truncate table emloyees;
 -- delete from emloyees;
 
insert into employees (id, name, age, sex, brithday, speciality)
	value(5, 'Vasily', 19, true, '2000-01-05', 'Stolyar');
insert into employees (id, name, age, sex, brithday, speciality)
	value(4, 'Mihail', 29, true, '1990-11-05', 'Stolyar')
		,(null, 'Olga', 49, false, '1970-06-25', 'Buhgalter');
insert into employees value (null, 'Igor', 5, true, null, null);
insert into employees (name, sex) value ('Ivan', '1');

select * from emloyees;
select id as 'Nomer', name, speciality from employees;

select * from employees where id > 7;
select * from emloyees where brithday > '1995-05-03' && age > 20;
select id, name, c.birthday from employees e;
select * from emloyees;
update emloyees set sex=false where name = 'Vasily';\
delete from employees 