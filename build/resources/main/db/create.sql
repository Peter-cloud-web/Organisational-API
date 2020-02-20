
SET MODE PostgreSQL;

--CREATE DATABASE organisation;

CREATE TABLE IF NOT EXISTS users (
id int PRIMARY KEY auto_increment,
  name VARCHAR,
  role VARCHAR,
  position VARCHAR,
  depId INTEGER,
);

CREATE TABLE IF NOT EXISTS News (
id int PRIMARY KEY auto_increment,
   topic VARCHAR,
   writer VARCHAR,
);

CREATE TABLE IF NOT EXISTS Department (
id int PRIMARY KEY auto_increment,
  depName VARCHAR,
  depDescription VARCHAR,
  numberOfEmployees INTEGER,
);