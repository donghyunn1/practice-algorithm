-- 코드를 입력하세요
SELECT i.name, i.datetime
from animal_ins i
LEFT JOIN ANIMAL_OUTS o ON i.ANIMAL_ID = o.ANIMAL_ID
WHERE o.ANIMAL_ID IS NULL
order by i.datetime asc
limit 3;