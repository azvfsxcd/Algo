# 프로그래머스 SQL 코딩테스트 연습

### IS_NULL

---

##### IS_NULL 1 - 이름이 없는 동물의 아이디

```SQL
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NULL;
```

##### IS_NULL 2 - 이름이 있는 동물의 아이디

```SQL
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NOT NULL;
```

##### IS_NULL 3 - NULL 처리하기

```SQL
SELECT ANIMAL_TYPE,
CASE
    WHEN NAME IS NULL THEN "No name"
    ELSE NAME
END AS NAME,
    SEX_UPON_INTAKE
FROM ANIMAL_INS;
```
