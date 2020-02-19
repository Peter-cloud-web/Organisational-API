
SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS users (
id int PRIMARY KEY auto_increment,
  name VARCHAR,
  Emprole VARCHAR,
  position VARCHAR,
);

CREATE TABLE IF NOT EXISTS News (
id int PRIMARY KEY auto_increment,
   topic VARCHAR,
   writer VARCHAR
);

CREATE TABLE IF NOT EXISTS Department (
id int PRIMARY KEY auto_increment,
  depName VARCHAR,
  depDescription VARCHAR,
  numberOfEmployees INTEGER,
  depId VARCHAR

);