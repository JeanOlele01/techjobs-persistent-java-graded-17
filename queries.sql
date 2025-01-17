   --Part 1

--id INT PRIMARY KEY
--employer VARCHAR(50)
--name VARCHAR(50)
--SKILLS VARCHAR(50)

--Part 2

SELECT name
FROM employer
WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;

--Part 4
SELECT * FROM skill
   LEFT JOIN job_skills ON skill_id = job_skills.skills_id
   WHERE job_skills.jobs_id IS NOT NULL
   ORDER BY name ASC;
