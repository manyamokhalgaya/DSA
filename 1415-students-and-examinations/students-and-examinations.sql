# Write your MySQL query statement below
SELECT s.student_id,s.student_name,sub.subject_name,count(e.student_id) attended_exams
from students s
cross join subjects sub
left join examinations e 
on s.student_id=e.student_id 
and sub.subject_name=e.subject_name
GROUP BY S.student_id, S.student_name, SUB.subject_name
ORDER BY S.student_id, S.student_name, SUB.subject_name
; 



