SELECT * FROM jaegers;

SELECT * FROM jaegers
WHERE status = 'true';

SELECT * FROM jaegers
WHERE mark = 'Mark-1' OR mark = 'Mark-4';

SELECT * FROM jaegers
ORDER BY mark
DESC;

SELECT * FROM jaegers
WHERE launch = (SELECT MIN(launch) FROM jaegers)
LIMIT 1;

SELECT * FROM jaegers 
WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers);

SELECT * FROM jaegers
WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM jaegers);

SELECT AVG(weight) FROM jaegers;

UPDATE jaegers SET kaijuKill = kaijuKill + 1
WHERE status = 'true';

DELETE FROM jaegers WHERE status = 'false';