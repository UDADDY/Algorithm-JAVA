SELECT
    result.HISTORY_ID,
    result.DAILY_FEE * result.DAYS * (100 - NVL(plan.DISCOUNT_RATE, 0)) / 100 AS FEE
FROM (
        SELECT
            car.CAR_ID,
            car.CAR_TYPE,
            car.DAILY_FEE,
            history.HISTORY_ID,
            (history.END_DATE - history.START_DATE + 1) AS DAYS,
            CASE
                WHEN 90 <= (history.END_DATE - history.START_DATE + 1) THEN '90일 이상'
                WHEN 30 <= (history.END_DATE - history.START_DATE + 1) THEN '30일 이상'
                WHEN 7 <= (history.END_DATE - history.START_DATE + 1) THEN '7일 이상'
                ELSE '없음'
            END AS DURATION_TYPE
        FROM CAR_RENTAL_COMPANY_CAR car
            , CAR_RENTAL_COMPANY_RENTAL_HISTORY history
        WHERE car.CAR_ID = history.CAR_ID
            AND car.CAR_TYPE = '트럭'
    ) result
LEFT JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN plan ON result.CAR_TYPE = plan.CAR_TYPE AND result.DURATION_TYPE = plan.DURATION_TYPE
ORDER BY FEE DESC, HISTORY_ID DESC