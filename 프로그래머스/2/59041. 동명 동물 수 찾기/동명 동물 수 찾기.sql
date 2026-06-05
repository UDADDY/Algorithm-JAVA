select
    NAME,
    COUNT(*) as COUNT
from ANIMAL_INS
group by NAME
having 2 <= count(*) and NAME IS NOT NULL
order by NAME