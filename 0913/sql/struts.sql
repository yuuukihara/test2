set names utf8;
set foreign_key_checks = 0;

drop database if exists my0913;

create database if not exists my0913;
use my0913;

drop table if exists loginUserTransaction;

create table loginUserTransaction(
	id int not null primary key auto_increment,
	loginId varchar(16),
	loginPass varchar(16),
	loginUserName varchar(50)
);

drop table if exists userBirthday;

create table userBirthday(
	id int not null primary key auto_increment,
	name varchar(50),
	birthday varchar(50)
);


insert into loginUserTransaction(loginId,loginPass,loginUserName) VALUE("Yuuki","Yuuki","Yuuki");
insert into userBirthday(name,birthday) VALUES("上岡龍太郎","1942/3/20");
