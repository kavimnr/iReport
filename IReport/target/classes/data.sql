--user table
insert into user(uname,password,email) values('kavi','kavi','kaviyarasan1098@gmail.com');
insert into user(uname,password,email) values('king','king','kaviyarasan1098@gmail.com');
insert into user(uname,password,email) values ('arikki','arikki','kaviyarasan1098@gmail.com');
insert into user(uname,password,email) values('vandan','vandan','kaviyarasan1098@gmail.com');
--employee table
insert into employees(emp_id,emp_name,city,email,mobile,age,salary) values(1,'kavi','kodaikanal','kaviyarasan1098@gmail.com','8940383367',23,100000);
insert into employees(emp_id,emp_name,city,email,mobile,age,salary) values(2,'arikki','kodaikanal','kaviyarasan1098@gmail.com','8940383367',25,200000);
insert into employees(emp_id,emp_name,city,email,mobile,age,salary) values(3,'maya','kodaikanal','kaviyarasan1098@gmail.com','8940383367',27,300000);
insert into employees(emp_id,emp_name,city,email,mobile,age,salary) values(4,'murugan','kodaikanal','kaviyarasan1098@gmail.com','8940383367',29,400000);
insert into employees(emp_id,emp_name,city,email,mobile,age,salary) values(5,'vaira','kodaikanal','kaviyarasan1098@gmail.com','8940383367',31,500000);
--role table
insert into role(uname,role) values('kavi','manager');
insert into role(uname,role) values('king','admin');
insert into role(uname,role) values('arikki','lead');
insert into role(uname,role) values('vandan','member');
commit;