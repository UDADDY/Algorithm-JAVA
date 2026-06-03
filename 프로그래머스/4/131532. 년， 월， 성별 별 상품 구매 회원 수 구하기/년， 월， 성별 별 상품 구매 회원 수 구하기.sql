-- GENDER 컬럼은 비어있거나 0 또는 1의 값을 가지며 0인 경우 남자를, 1인 경우는 여자를 나타냅니다.
select
    EXTRACT(YEAR FROM sale.SALES_DATE) AS YEAR,
    EXTRACT(MONTH FROM sale.SALES_DATE) AS MONTH,
    info.GENDER AS GENDER,
    COUNT(DISTINCT info.USER_ID) AS USERS
from ONLINE_SALE sale
    , USER_INFO info
where sale.USER_ID = info.USER_ID
group by EXTRACT(YEAR FROM sale.SALES_DATE), EXTRACT(MONTH FROM sale.SALES_DATE), info.GENDER
having info.GENDER IS NOT NULL
order by YEAR, MONTH, GENDER