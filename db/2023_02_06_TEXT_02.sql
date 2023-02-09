/* 1 */
CREATE TABLE sales ( 

    customer VARCHAR(255), 

    amount INT

);

INSERT INTO sales (customer, amount)

VALUES 

    ('John', 100), 

    ('Jane', 200), 

    ('John', 150), 

    ('Jane', 50), 

    ('Jim', 300);
   
create view sum_table as 
select
	customer,
    SUM(amount) as total_sales
from
	sales
group by
	customer;
    
select
	customer,
    total_sales,
    RANK() OVER(ORDER BY total_sales DESC) sales_rank
from
	sum_table
ORDER BY sales_rank DESC;

/* 2 */
create role admin_group;
create user 'new_user';

grant admin_group to 'new_user';
grant select, insert, update on * to 'new_user';

/* 3 */
create database user_db;
create table user_mst(
	USER_ID int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    USERNAME varchar(20) NOT NULL,
    EMAIL VARCHAR(100) NOT NULL
);

insert into user_mst
	values
		(0, 'JOHN', 'JOHN@gmail.com'),
        (0, 'JANE', 'JANE@gmail.com'),
        (0, 'JIM', 'JIM@gmail.com');

create table user_dtl(
	USER_ID int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    PHONE varchar(20) NOT NULL,
    GENDER VARCHAR(100) NOT NULL
);

insert into user_dtl
	values
		(0, '010-1111-2222', 'MALE'),
        (0, '010-3333-4444', 'FEMALE'),
        (0, '010-5555-6666', 'MALE');
	

select * from user_mst;
call FIND_USER_BY_USERNAME('JOHN');
drop procedure FIND_USER_BY_USERNAME;

create procedure FIND_USER_BY_USERNAME(
	USERNAME varchar(20)
)
select
	um.USER_ID,
    um.USERNAME,
    um.EMAIL,
    ud.PHONE,
    ud.GENDER
from
	user_mst um
    left outer join user_dtl ud on(ud.USER_ID = um.USER_ID)
where
	um.USERNAME = USERNAME
    
