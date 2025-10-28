-- 코드를 작성해주세요
select hd.dept_id, hd.dept_name_en, round(avg(he.sal), 0) AS avg_sal
from hr_department hd
join hr_employees he on hd.dept_id = he.dept_id
group by hd.dept_id
order by avg(he.sal) desc;
