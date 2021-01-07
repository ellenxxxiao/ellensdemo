-- ***WARNING*** --
-- Running this script may drop your existing database called "university", if any. --
drop database if exists university;
CREATE DATABASE university CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
use university;

drop table if exists user;

-- create table user
create table user(user_id int(10) primary key auto_increment,
		user_name varchar(100) not null,
		user_password varchar(100) not null);

-- insert one row into the table
insert into user(user_name, user_password) values ("a", "a");
commit;

-- check that inserted row exist
select * from user;