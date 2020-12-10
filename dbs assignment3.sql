create database ass3;
use ass3;
create table Department ( dept_id integer(6) primary key,dept_name varchar(50));
insert into Department values(1,'finance');
insert into Department values(2,'training');
insert into Department values(3,'Marketing');
select * from Department;


create table Employee(empid integer(5),	emp_name varchar(30),dept_id integer(5),salary integer(10), manager varchar(30));
insert into Employee values (1,'Arun',1,8000,4);
insert into Employee values (2,'Kiran',1,7000,1);
insert into Employee values (3,'Scott',1,3000,1);
insert into Employee values (4,'Max',2,9000,1);
insert into Employee values (5,'Jack',2,8000,4);
insert into Employee values (6,'King', null,6000,1);
ALTER TABLE Employee ADD FOREIGN KEY (dept_id) REFERENCES Department(dept_id);

SELECT sum(salary) FROM Employee GROUP BY dept_id;

select * from employee;
select * from Department;

SELECT SUM(dept_id),salary
FROM Employee
GROUP BY dept_id
HAVING SUM(salary) > 18000 ;

SELECT SUM(dept_id),salary
FROM Employee
GROUP BY dept_id
HAVING SUM(salary) < 20000 ;

select * from employee;