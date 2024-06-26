SELECT USER_ID, NICKNAME, sum(PRICE) as TOTAL_SALES
FROM USED_GOODS_BOARD as b JOIN USED_GOODS_USER as u
ON b.WRITER_ID = u.USER_ID
WHERE STATUS = 'DONE'
GROUP BY WRITER_ID
HAVING SUM(b.PRICE) >= 700000
ORDER BY TOTAL_SALES ASC;