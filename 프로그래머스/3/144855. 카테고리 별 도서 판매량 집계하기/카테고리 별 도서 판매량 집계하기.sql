-- 코드를 입력하세요
SELECT b.category, sum(bs.sales) AS TOTAL_SALES
FROM BOOK b
JOIN BOOK_SALES bs ON bs.book_id = b.book_id
WHERE bs.sales_date between '2022-01-01' and '2022-01-31'
GROUP BY b.category
order by b.category asc;