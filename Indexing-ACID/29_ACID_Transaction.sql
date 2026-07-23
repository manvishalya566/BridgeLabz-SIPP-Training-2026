START TRANSACTION;
INSERT INTO vaccine_distribution(country,date,doses) VALUES('India','2026-01-01',1000);
INSERT INTO vaccine_distribution(country,date,doses) VALUES('Japan','2026-01-01',500);
COMMIT;
-- On error: ROLLBACK;