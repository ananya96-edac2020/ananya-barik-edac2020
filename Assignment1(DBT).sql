show databases;
create database Assignment;
use Assignment;
create table Member(
member_id  int(5),
member_name varchar(30),
member_address varchar(50),
acc_open_date  date,
member_type  varchar(20),
penalty_amount int(5)
);
show tables;
select * from member;
create table books(
book_no int(6),
book_name varchar(30),
author_name varchar(30),
cost      int(7),
catagory  char(10)
);
show  tables;
select * from books;
create table issue(
Lib_issue_Id  int(10));

alter table issue add(
Book_no int(6),
member_id int(5),
issue_date date,
return_date date);
select * from issue;
alter table member drop penalty_amount;
insert into member values(1,"Richa Sharma","pune",'2010-12-05',"Life time");
insert into member values(2,"Garima Sen","pune",curdate(),"Annual");

insert into books  value(101,"Let us c","Denis Retchie",450,"System");
insert into books  value(102,"Oracle-complete ref ","Loni",550,"Data base");
insert into books  value(103,"Mastering SQL","Loni",250,"Data base");
insert into books  value(104,"PL-SQL-ref","ScottUrman",750,"Data base");
select * from books;
drop table issue;
insert into issue value(701, 101 ,1 ,'2010-12-06',null);
insert into issue value(702, 102 ,2 ,'2025-12-06',null);
insert into issue value(703, 104 ,1 ,'2015-01-15',null);
insert into issue value(704, 101 ,1 ,'2004-07-04',null);
insert into issue value(705, 104 ,2 ,'2015-11-06',null);
insert into issue value(706, 101 ,3 ,'2018-02-06',null);
select * from issue;
update books set cost=300 where book_no=103;







