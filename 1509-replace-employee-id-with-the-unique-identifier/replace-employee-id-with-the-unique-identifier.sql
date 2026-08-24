# Write your MySQL query statement below
SELECT e2.unique_id,e.name
from employees e
left join employeeUNI e2
on e.id=e2.id;
