select distinct
    id,
    TO_CHAR(visit_date, 'YYYY-MM-DD') as visit_date, 
    people
from (
    select
        *
    from Stadium s
    where 100 <= s.people
        AND EXISTS (
            select
                1
            from Stadium s2
            where id = s.id + 1
                AND 100 <= people
        )
        AND EXISTS (
            select
                1
            from Stadium s3
            where id = s.id + 2
                AND 100 <= people
        )

    union all

    select
        *
    from Stadium s
    where 100 <= s.people
        AND EXISTS (
            select
                1
            from Stadium s2
            where id = s.id - 1
                AND 100 <= people
        )
        AND EXISTS (
            select
                1
            from Stadium s3
            where id = s.id + 1
                AND 100 <= people
        )

    union all

    select
        *
    from Stadium s
    where 100 <= s.people
        AND EXISTS (
            select
                1
            from Stadium s2
            where id = s.id - 2
                AND 100 <= people
        )
        AND EXISTS (
            select
                1
            from Stadium s3
            where id = s.id - 1
                AND 100 <= people
        )
)
order by id asc