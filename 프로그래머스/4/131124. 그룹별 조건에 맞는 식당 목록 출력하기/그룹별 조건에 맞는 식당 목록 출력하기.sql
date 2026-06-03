select
    profile.MEMBER_NAME,
    review.REVIEW_TEXT,
    TO_CHAR(review.REVIEW_DATE, 'YYYY-MM-DD') AS REVIEW_DATE
from (
    select
        *
    from (
        select
            MEMBER_ID,
            count(*)
        from REST_REVIEW
        group by MEMBER_ID
        order by count(*) desc
    )
    where rownum <= 1
) top_member
    , REST_REVIEW review
    , MEMBER_PROFILE profile
where top_member.MEMBER_ID = review.MEMBER_ID
    AND profile.MEMBER_ID = review.MEMBER_ID
order by REVIEW_DATE, REVIEW_TEXT