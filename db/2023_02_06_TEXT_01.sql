/* 1. */ 
create database delivery_db
charset utf8mb4
collate utf8mb4_general_ci;

create table delivery_mst(
	delivery_id int PRIMARY KEY auto_increment NOT NULL,
	delivery_company varchar(20) NOT NULL,
	delivery_man varchar(15) NOT NULL,
	delivery_address varchar(100) NOT NULL,
	consignee_name varchar(15) NOT NULL,
	consignee_phone varchar(14) NOT NULL,
	consignee_message text
);

/* 2. */ 
show databases;
use delivery_db;
show tables;
desc delivery_mst;

/* 3. */
create database student_db;
use student_db;

create table 학생(
	학번 int PRIMARY KEY auto_increment NOT NULL,
    이름 varchar(20) NOT NULL
);

create table 과목(
	과목번호 int PRIMARY KEY auto_increment NOT NULL,
    과목이름 varchar(20) NOT NULL
);

create table 성적(
	순번 int PRIMARY KEY auto_increment NOT NULL,
    학번 int NOT NULL,
    과목번호 int NOT NULL,
    점수 int NOT NULL
);

insert into 학생 (이름) values ('김춘식');
insert into 학생 (이름) values ('손흥민');

insert into  과목 (과목이름) values ('컴퓨터 구조');
insert into  과목 (과목이름) values ('데이터베이스');
insert into  과목 (과목이름) values ('인공지능');

insert into 성적 (학번, 과목번호, 점수) values (1, 1, 95);
insert into 성적 (학번, 과목번호, 점수) values (2, 1, 84);
insert into 성적 (학번, 과목번호, 점수) values (1, 2, 89);
insert into 성적 (학번, 과목번호, 점수) values (2, 2, 92);
insert into 성적 (학번, 과목번호, 점수) values (1, 3, 100);
insert into 성적 (학번, 과목번호, 점수) values (2, 3, 88);

select 
	성적.순번,
    성적.학번,
    학생.이름,
    성적.과목번호,
    과목.과목이름,
    성적.점수
from
	성적
	left outer join 학생 on(학생.학번 = 성적.학번)
    left outer join 과목 on(과목.과목번호 = 성적.과목번호)
where
	성적.과목번호 < 3;
    
/* 4 */
truncate table 상품;

create database product_db;
create table 상품(
	상품코드 int PRIMARY KEY AUTO_INCREMENT,
    상품명 varchar(20) NOT NULL,
    수량 int NOT NULL
);

insert into 상품 (상품명, 수량) values ('딸기사탕', 50);
insert into 상품 (상품명, 수량) values ('누룽지사탕', 100);

START TRANSACTION;
INSERT INTO `상품`
VALUES(0, '오렌지사탕', 20);

UPDATE `상품`
SET
    `수량` = 200
WHERE
    `상품코드` = 2;
    
DELETE
FROM
    `상품`
WHERE
    `상품코드` = 2;
rollback;

INSERT INTO `상품`
VALUES(0, '오렌지사탕', 20);

UPDATE `상품`
SET
	`수량` = 200
WHERE `상품코드` = 1;

DELETE
FROM
    `상품`
WHERE
    `상품코드` = 2;
COMMIT;

/* 5 */
create database student_db2;
use student_db2;

create table 학생(
	학번 int PRIMARY KEY NOT NULL,
    이름 varchar(20) NOT NULL,
    전공 varchar(20) NOT NULL
);

insert into 학생
values
	(20013001, '홍길동', '컴퓨터공학과'),
	(20013002, '김철수', '전자공학과');

create index STUDENT_CODE_INDEX	ON 학생 (학번);

/* 6 */
use chatting;

create view USER_VIEW as
SELECT
    `ID`,

    `USERNAME`,

    `PASSWORD`,

    `NAME`,

    `EMAIL`

FROM

    `USER_MST`

WHERE

    `ID` BETWEEN 1 AND 200;
    
select
	*
from
	USER_VIEW
where
	`USERNAME` like 'a%';
    
/* 7 */
use student_db2;



select
	학생.UNIQUENESS
from
	ALL_INDEXS 학생
where
	table_name = 학생;



SHOW FULL TABLES IN STUDENT_DB
WHERE TABLE_TYPE LIKE 'VIEW';
	