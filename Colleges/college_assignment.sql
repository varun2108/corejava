create table college (cid number primary key,cname varchar2(20),coursetype varchar2(20),city varchar2(20),fees number,pincode number)

create sequence college_id
start with 1000
increment by 1
nocache
nocycle;

