select distinct
    id,
    TO_CHAR(VISIT_DATE, 'YYYY-MM-DD') AS VISIT_DATE,
    NOW_ AS people
from (
    select
        id,
        visit_date,
        LAG(people, 2) OVER(order by id asc) as Before_2,
        LAG(people, 1) OVER(order by id asc) as Before_1,
        people as Now_,
        LEAD(people, 1) OVER(order by id asc) as After_1,
        LEAD(people, 2) OVER(order by id asc) as After_2
    from Stadium
)
where 100 <= NOW_
    AND (
        (100 <= BEFORE_2 AND 100 <= BEFORE_1 AND 100 <= NOW_) -- 그제, 어제, 오늘
        OR (100 <= BEFORE_1 AND 100 <= NOW_ AND 100 <= After_1) -- 어제, 오늘, 내일
        OR (100 <= NOW_ AND 100 <= After_1 AND 100 <= After_2) -- 오늘, 내일, 모레
    )
order by id