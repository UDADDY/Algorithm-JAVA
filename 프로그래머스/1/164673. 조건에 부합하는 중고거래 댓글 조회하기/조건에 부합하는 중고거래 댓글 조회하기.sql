-- 코드를 입력하세요
SELECT
    b.title as title,
    b.BOARD_ID as BOARD_ID,
    r.REPLY_ID as REPLY_ID,
    r.WRITER_ID as WRITER_ID,
    r.CONTENTS as CONTENTS,
    TO_CHAR(r.CREATED_DATE, 'yyyy-mm-dd') as CREATED_DATE
FROM USED_GOODS_BOARD b, USED_GOODS_REPLY r
WHERE 1=1 
    AND TO_CHAR(b.CREATED_DATE, 'yyyy-mm') = '2022-10'
    AND b.BOARD_ID = r.BOARD_ID
ORDER BY r.CREATED_DATE, b.title
;