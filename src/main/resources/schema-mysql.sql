DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS authorities;
DROP TABLE IF EXISTS users;

CREATE TABLE db_encrypt.employee (
  empId VARCHAR(10) NOT NULL,
  empName VARCHAR(100) NOT NULL
);

create table db_encrypt.users (
    username varchar(50) not null primary key,
    password varchar(120) not null,
    enabled boolean not null
);

create table db_encrypt.authorities (
    username varchar(50) not null,
    authority varchar(50) not null,
    foreign key (username) references users (username)
);

