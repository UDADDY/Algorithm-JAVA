select
    customer_number
from (
    select
        customer_number,
        count(*) as count
    from Orders
    group by customer_number
    order by count desc
)
where rownum = 1