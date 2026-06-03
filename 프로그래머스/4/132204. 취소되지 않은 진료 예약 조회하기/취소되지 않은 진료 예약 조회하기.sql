SELECT
    apnt.APNT_NO,
    pat.PT_NAME,
    pat.PT_NO,
    apnt.MCDP_CD,
    doc.DR_NAME,
    apnt.APNT_YMD
FROM APPOINTMENT apnt
    , DOCTOR doc
    , PATIENT pat
WHERE TO_CHAR(apnt.APNT_YMD, 'YYYY-MM-DD') LIKE '%2022-04-13%'
    AND apnt.APNT_CNCL_YN = 'N'
    AND apnt.MCDP_CD = 'CS'
    AND apnt.MDDR_ID = doc.DR_ID
    AND apnt.PT_NO = pat.PT_NO
ORDER BY APNT_YMD