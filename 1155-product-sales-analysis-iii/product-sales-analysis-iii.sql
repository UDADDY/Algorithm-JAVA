select
    product_id,
    year as first_year,
    quantity,
    price
from (
    select
        s.*,
        MIN(YEAR) over (partition by product_id) as first_year
    from Sales s
)
where year = first_year