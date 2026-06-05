select
    NAME,
    DATETIME
from (
    select
        i.NAME,
        i.DATETIME
    from ANIMAL_INS i
        , ANIMAL_OUTS o
    where i.ANIMAL_ID = o.ANIMAL_ID (+)
        and o.ANIMAL_ID IS NULL
    order by i.DATETIME asc
)
where rownum <= 3