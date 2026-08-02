# Write your MySQL query statement below
select e.name
from employee e
join employee e2
on e.Id=e2.managerId
group by e2.managerId
having count(*)>=5;
