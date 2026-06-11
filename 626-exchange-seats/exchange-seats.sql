select
    s1.id as ID,
    NVL(s2.student, s1.student) as STUDENT
from Seat s1, Seat s2
where s1.id + 1 = s2.id (+)
    and MOD(s1.id, 2)  = 1

union all

select
    s1.id as ID,
    NVL(s2.student, s1.student) as STUDENT
from Seat s1, Seat s2
where s1.id - 1 = s2.id (+)
    and MOD(s1.id, 2) = 0

order by id