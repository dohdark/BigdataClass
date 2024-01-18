-- 데이터 베이스 생성
create database jdbctest;
use jdbctest;

-- bigdatamember 테이블 생성
-- id vc50 pk
-- pw vc100 nn
-- b_name vc50 nn
-- age int
-- score int


create table bigdatamember (
	id varchar(50) primary key,
    pw varchar(100) not null,
    b_name varchar(50) not null,
    age int,
    score int
);

select * from bigdatamember;






















