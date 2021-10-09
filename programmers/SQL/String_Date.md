# 프로그래머스 SQL 코딩테스트 연습

### String_Date

---

##### String_Date 1 - 루시와 엘라 찾기

```SQL
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
ORDER BY ANIMAL_ID;
```

##### String_Date 2 - 이름에 el이 들어가는 동물 찾기

```SQL
SELECT ANIMAL_ID, NAME,
CASE
    WHEN SEX_UPON_INTAKE LIKE "%Neutered%" OR SEX_UPON_INTAKE LIKE "%Spayed%"
    THEN "O"
    ELSE 'X'
    END AS "중성화"
FROM ANIMAL_INS;
```

##### String_Date 3 - 오랜 기간 보호한 동물(2)

```SQL
SELECT A.ANIMAL_ID, A.NAME
FROM ANIMAL_INS A LEFT JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
ORDER BY B.DATETIME - A.DATETIME DESC
LIMIT 2;
```

##### String_Date 4 - DATETIME에서 DATE로 형 변환

```SQL
SELECT ANIMAL_ID, NAME, DATE_FORMAT(DATETIME, "%Y-%m-%d") "날짜"
FROM ANIMAL_INS
```
