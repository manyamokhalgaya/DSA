# Write your MySQL query statement below
select d.name as Department,e.name as Employee ,salary
from employee as e
join department d
on e.departmentId=d.id
where (
    select count(distinct salary)
    from employee e2
    where e2.departmentId = e.departmentId AND e2.salary >= e.salary
)<=3
order by Department,Salary DESC;
