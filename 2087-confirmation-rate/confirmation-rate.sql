# Write your MySQL query statement below
-- SELECT s.user_id,round(avg(IIF(c.action='confirmed',1.00,0)
-- ),2)confirmation_rate
-- from Signups s
-- left join confirmations c
-- on s.user_id=c.user_id
-- group by c.user_id
# Write your MySQL query statement below

SELECT s.user_id, 
  ROUND(AVG(IF(c.action='confirmed',1,0)),2) as confirmation_rate 
FROM Signups s
LEFT JOIN Confirmations c using (user_id)
GROUP BY s.user_id

