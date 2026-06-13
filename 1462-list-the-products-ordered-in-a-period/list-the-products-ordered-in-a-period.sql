select
    p.product_name,
    s.sum as unit
from Products p, (
    select
        product_id,
        sum(unit) as sum
    from Orders
    where DATE '2020-02-01' <= order_date AND order_date < DATE '2020-03-01'
    group by product_id
    having 100 <= sum(unit)
) s
where p.product_id = s.product_id