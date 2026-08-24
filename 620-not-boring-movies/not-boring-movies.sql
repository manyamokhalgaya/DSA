# Write your MySQL query statement below
SELECT *
from cinema as c
where c.id %2=1
and c.description !='boring'
order by c.rating desc;