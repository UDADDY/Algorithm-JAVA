select
    info.FOOD_TYPE,
    info.REST_ID,
    info.REST_NAME,
    info.FAVORITES
from REST_INFO info
    , (
        select
            FOOD_TYPE,
            MAX(FAVORITES) AS MAX_FAV
        from REST_INFO
        group by FOOD_TYPE    
    ) max
where info.FOOD_TYPE = max.FOOD_TYPE AND info.FAVORITES = max.MAX_FAV
order by FOOD_TYPE desc