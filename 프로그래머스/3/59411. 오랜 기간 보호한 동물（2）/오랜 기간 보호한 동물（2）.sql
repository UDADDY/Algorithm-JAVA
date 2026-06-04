select
    ANIMAL_ID,
    NAME
from (
    select
        o.ANIMAL_ID,
        o.NAME,
        o.DATETIME - i.DATETIME AS LENGTH
    from ANIMAL_OUTS o
        , ANIMAL_INS i
    where o.ANIMAL_ID = i.ANIMAL_ID
    order by LENGTH DESC
)
where rownum <= 2