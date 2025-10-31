-- 코드를 작성해주세요
select year(differentiation_date) as year, (select max(size_of_colony) from ecoli_data where year(differentiation_date) = year(e.differentiation_date)) - e.size_of_colony as year_dev, e.id
from ecoli_data e
order by year asc, year_dev asc;