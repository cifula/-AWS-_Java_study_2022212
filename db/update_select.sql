select * from library_mst;
    
/*======================<< select insert >>==========================*/




insert into author_mst 
	(author_name)
select distinct /* 중복제거 */
	저작자
from
	library_mst
order by		/* 정렬 */
	저작자;


insert into publisher_mst 
	(publisher_name)
select distinct /* 중복제거 */
	출판사
from
	library_mst
order by		/* 정렬 */
	출판사;
    
select * from publisher_mst;


/*======================<< select update author >>==========================*/

update library_mst lm, author_mst am
set lm.저작자 = am.author_id
where lm.저작자 = am.author_name;
                    
select * from library_mst
order by 저작자;

/*======================<< select update publisher >>==========================*/

update library_mst lm, publisher_mst pm
set lm.출판사 = pm.publisher_id
where lm.출판사 = pm.publisher_name;
                    
select
	* 
from 
	library_mst lm
    left outer join author_mst am on(am.author_id = lm.저작자)
    left outer join publisher_mst pm on(pm.publisher_id = lm.출판사)
order by 
저작자;

/*====================================================================*/

select
	도서관명,
    도서명
from
	library_mst
where
	저작자 in (select author_id from author_mst where author_name like '%김주%');





