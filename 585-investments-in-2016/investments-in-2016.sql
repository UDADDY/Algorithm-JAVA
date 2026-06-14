select
    ROUND(SUM(TIV_2016), 2) as TIV_2016
from Insurance i
where NOT EXISTS (
    select
        1
    from Insurance
    where pid != i.pid and lat = i.lat and lon = i.lon
)
    AND EXISTS (
        select
            1
        from Insurance
        where pid != i.pid and tiv_2015 = i.tiv_2015
    )