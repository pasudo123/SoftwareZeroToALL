# Database Index
```
Database Index 개념 정리.
```

## Database Index
> 테이블이나 클러스터에 쓰여지는 선택적인 객체
* SQL 수행속도를 향상시키기 위해서 고안
* 인덱스가 수행하는 역할은 인간이 단어를 찾을때 책자 맨 뒤의 색인(Index) 를 찾는것과 별반 다르지 않음
* 인덱스가 없다는 것은 모든 데이터에 대해 일일히 데이터 액세스를 하고 있다는 것 (그만큼의 비용이 발생)
* DML 언어에 대해서 인덱스가 필요하다. (SELECT, UPDATE, DELETE)

## Database Index 추가 내용
* table row 에 하나씩 대응되는 별도의 객체 (object)
* [옵티마이저](http://www.gurubee.net/lecture/2400)가 최적의 경로를 결정하기 위해 사용하는 요소 (factor)
* 인덱스는 생성시킨 컬럼의 값과 table row 의 ROWID 로 구성되어 있으며, 이 컬럼들은 정려되어 있는 상태
* 인덱스는 하나의 테이블에 여러 개를 지정할 수 있고, 하나의 컬럼이 여러 개의 인덱스에 포함될 수 있음
* 테이블과 무관하게 CREATE 또는 DROP 이 독립적으로 가능하다.
* __자동인덱스__ : Primary key 또는 Uninque 제약조건에 의해 자동적으로 생성된 인덱스
* __수동인덱스__ : CREATE INDEX 명령어를 통해서 만든 인덱스

## Clustering Index (클러스터형 인덱스)
* 클러스터형 인덱스는 해당 키 값을 기반으로 테이블이나 뷰의 데이터 행을 정렬하고 저장한다. __Primary Key 에 한하여 적용__ 
* 데이터 행 자체는 한가지 순서로만 저장될 수 있으므로 테이블당 클러스터형 인덱스는 하나만 있을 수 있다.
* 물리적으로 행을 __재배열__
* 인덱스 페이지 용량이 넌클러스터드 인덱스 페이지 용량보다 상대적으로 __작다.__ (데이터베이스 용량을 적게 차지한다.)
* 테이블당 1개

## Non Clustering Index (넌클러스터형 인덱스)
* 비클러스터형 인덱스는 데이터 행으로부터 독립적이다. 
* 비클러스터형 인덱스에는 비클러스터형 인덱스 키 값이 있으며 각 키 값 항목에는 해당 키 값이 포함된 데이터 행에 대한 포인터가 있다. 
* 물리적으로 행을 __재배열 하지 않는다.__ 
* 인덱스 페이지 용량이 클러스터드 인덱스 페이지 용량보다 상대적으로 __크다.__ (데이터베이스 용량을 크게 차지한다.)
* 테이블당 249개
* 데이터베이스 용량을 

### 조회결과의 약 30% 가 선택되는 정도라면, 데이터를 _클러스터드 인덱스_ 로 설정

### 조회결과의 약 3% 내외가 선택되는 정도라면, 데이터를 _넌클러스터 인덱스_ 로 설정

## 결론
* 인덱스는 데이터베이스의 테이블 내 원하는 레코드를 빠르게 찾아갈 수 있도록 만들어진 데이터구조이다. 
* 기본적인 목적은 검색 성능의 최적화

## 참고링크
1. [꿈꾸는 개발자, DBA 커뮤니티 구루비](http://www.gurubee.net/)
2. [Clustered vs. Nonclustered Index Structures in SQL Server](https://www.youtube.com/watch?v=ITcOiLSfVJQ&t=363s)