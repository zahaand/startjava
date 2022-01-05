CREATE DATABASE jaegers;
\connect jaegers;
CREATE TABLE jaegers (
id SERIAL PRIMARY KEY, 
modelName TEXT, 
mark TEXT, 
height INTEGER, 
weight DOUBLE PRECISION, 
status BOOLEAN, 
origin TEXT, 
launch INTEGER, 
kaijuKill INTEGER);