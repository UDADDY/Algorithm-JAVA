select
    *
from PLACES
where HOST_ID IN (
    select
        HOST_ID
    from PLACES
    group by HOST_ID
    having 2 <= COUNT(HOST_ID)
)
order by id