# Write your MySQL query statement below
SELECT c.name AS Customers
from customers as c
left join orders as o
on c.id=o.customerid
where o.customerid is null;