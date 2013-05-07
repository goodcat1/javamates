drop schema JAVAMATES restrict;
create schema JAVAMATES;

drop table JAVAMATES.CLAIM;
create table JAVAMATES.CLAIM(id BIGINT not null primary key,
user_id BIGINT not null,
amount numeric(12, 0) not null,
period int not null,
rate numeric(10,2) not null,
purpose_id BIGINT not null,
create_date timestamp not null,
status_id BIGINT not null,
description varchar(512)
);

DROP SEQUENCE JAVAMATES.SEQ_CLAIM RESTRICT;
CREATE SEQUENCE JAVAMATES.SEQ_CLAIM
AS BIGINT
START WITH 1;

insert into JAVAMATES.CLAIM(ID, USER_ID, AMOUNT, PERIOD,
RATE, PURPOSE_ID, CREATE_DATE, STATUS_ID, DESCRIPTION)
values (1, 0, 1200, 11,
1.5, 0, CURRENT_TIMESTAMP, 0, 'First claim');