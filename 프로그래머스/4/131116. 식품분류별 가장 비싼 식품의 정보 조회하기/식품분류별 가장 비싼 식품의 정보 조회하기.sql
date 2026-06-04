select
    p.CATEGORY,
    p.price AS MAX_PRICE,
    p.PRODUCT_NAME
from FOOD_PRODUCT p
    , (
        select
            CATEGORY,
            MAX(PRICE) AS MAX_PRICE
            -- PRODUCT_NAME
        from FOOD_PRODUCT
        where CATEGORY IN ( '과자', '국', '김치', '식용유')
        group by CATEGORY    
    ) max
where p.CATEGORY = max.CATEGORY AND p.price = max.MAX_PRICE
order by MAX_PRICE desc