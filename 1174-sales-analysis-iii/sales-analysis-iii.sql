select
    p.product_id,
    p.product_name
from Product p, Sales s
where p.product_id = s.product_id
group by p.product_id, p.product_name
having DATE '2019-01-01' <= MIN(s.sale_date) AND MAX(s.sale_date) <= DATE '2019-03-31'

-- select distinct
--     p.product_id,
--     p.product_name
-- from Product p, (
--     select
--         s1.PRODUCT_ID
--     from Sales s1
--     where NOT EXISTS (
--         select
--             1
--         from Sales s2
--         where
--             s1.product_id = s2.product_id
--             AND NOT (DATE '2019-01-01' <= s2.sale_date AND s2.sale_date <= DATE '2019-03-31')
--     )
--         AND DATE '2019-01-01' <= s1.sale_date AND s1.sale_date <= DATE '2019-03-31'
-- ) s
-- where p.product_id = s.product_id
-- -- select
-- --     *
-- -- from Sales
-- -- where DATE '2019-01-01' <= sale_date AND sale_date <= DATE '2019-03-31'