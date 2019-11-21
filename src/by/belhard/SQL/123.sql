use bh18db;

drop table emloyees ;

create table emloyees (
id int auto_increment primary key,
name varchar(56) not null unique,
date_of_employment datetime default now(),
specialty_id int,
salary int check(salary >= 0) 
);

alter table emloyees add foreign key(specialty_id)

create table specialties (
id int auto_increment primary key,
speciality varchar(56) not null unique
);

insert into specialties values
(null,'Dew'),
(null,'uykukffk'),
(null,'wefjkhjkhjk'),
(null,'djdjfgkfjkmf');

insert into emloyees values
(null, 'ijhriottytjh', null, 1, 1567),
(null, 'tiuqqqlouil', null, 2, 1887),
(null, 'ijhroooiojh', null, 3, 1665),
(null, 'ijwewqhriojh', null, 4, 1067),
(null, 'ijhritrttojh', null, 5, 1578),
(null, 'ijhrdjdhjiojh', null, 6, 1534),
(null, 'ijhrijkhjlojh', null, 7, 1500);

select * from emloyees;
select * from specialties;

select * from emloyees e join specialties s on (e.specialty_id = s.id)
 order by s.id, salary desc
 limit 2, 3;
 
 select  sum(salary) from emloyees;
 select specialty, avg(salary) from specialties s join emloyees e on (e. specialty_id = s.id)
 group by specialty;