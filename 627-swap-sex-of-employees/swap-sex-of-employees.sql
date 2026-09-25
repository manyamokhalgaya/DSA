# Write your MySQL query statement below
UPDATE salary SET sex=
CASE WHEN  SEX='m' THEN 'f'
ELSE 'm'
END;
