select
    product.PRODUCT_ID,
    product.PRODUCT_NAME,
    sum.AMOUNT * product.PRICE AS TOTAL_SALES
from FOOD_PRODUCT product
    , (
        select
            PRODUCT_ID,
            SUM(AMOUNT) AS AMOUNT
        from FOOD_ORDER
        where TO_CHAR(PRODUCE_DATE, 'YYYY-MM') = '2022-05'
        group by PRODUCT_ID
    ) sum
where product.PRODUCT_ID = sum.PRODUCT_ID
order by TOTAL_SALES desc, PRODUCT_ID