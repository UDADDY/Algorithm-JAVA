select
    s.product_id,
    s2.MIN_YEAR AS FIRST_YEAR,
    s.quantity,
    s.price
from Sales s, (
    select
        product_id,
        MIN(year) as MIN_YEAR
    from Sales
    group by product_id
) s2
where s.product_id = s2.product_id AND s.year = s2.MIN_YEAR

