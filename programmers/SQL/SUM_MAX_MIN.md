# 프로그래머스 SQL 코딩테스트 연습

### SUM_MAX_MIN

---

##### SUM_MAX_MIN 1 - 최댓값 구하기

```SQL
SELECT MAX(DATETIME) 시간
FROM ANIMAL_INS;
```

##### SUM_MAX_MIN 2 - 최솟값 구하기

```SQL
SELECT MIN(DATETIME) 시간
FROM ANIMAL_INS;
```

##### SUM_MAX_MIN 3 - 동물 수 구하기

```SQL
SELECT COUNT(*) count
FROM ANIMAL_INS;
```

##### SUM_MAX_MIN 4 - 중복 제거하기

```SQL
SELECT COUNT(DISTINCT NAME) count
FROM ANIMAL_INS;
```
