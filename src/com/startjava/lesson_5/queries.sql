SELECT * FROM jaegers;
SELECT * FROM jaegers WHERE status = 'true';
SELECT * FROM jaegers WHERE mark = 'Mark-1' AND 'Mark-4';
SELECT * FROM jaegers ORDER BY mark DESC;
SELECT MAX(launch) FROM jaegers;
SELECT MAX(kaijuKill) FROM jaegers;
SELECT MIN(kaijuKill) FROM jaegers;
SELECT AVG(weight) FROM jaegers;
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'true';
DELETE FROM jaegers WHERE status = 'false';