CREATE INDEX idx_inf_cover ON covid_cases(infection_rate DESC,country);
SELECT country,infection_rate FROM covid_cases ORDER BY infection_rate DESC LIMIT 10;