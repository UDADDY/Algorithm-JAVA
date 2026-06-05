select
    ANIMAL_TYPE,
    COUNT(*) AS count
from ANIMAL_INS
group by ANIMAL_TYPE
order by ANIMAL_TYPE