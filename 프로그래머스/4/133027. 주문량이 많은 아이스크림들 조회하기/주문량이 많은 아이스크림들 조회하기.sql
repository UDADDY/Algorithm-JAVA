SELECT
    FLAVOR
FROM (
    SELECT
        half.FLAVOR,
        half.TOTAL_ORDER + july.JULY_SUM AS TOTAL_ORDER
    FROM FIRST_HALF half
        , (
        SELECT
            FLAVOR,
            SUM(TOTAL_ORDER) AS JULY_SUM
        FROM JULY
        GROUP BY FLAVOR    
        ) july
    WHERE half.FLAVOR = july.FLAVOR
    ORDER BY TOTAL_ORDER DESC
)
WHERE ROWNUM <= 3