create table vacancy
(
	id serial not null
		constraint vacancy_pkey
			primary key,
	title varchar(500) not null,
	description varchar(10000) not null,
	companyid integer not null,
	recruiterid integer not null
)
;

comment on table vacancy is 'This table will store jobs in system'
;

create unique index vacancy_id_uindex
	on vacancy (id)
;

-----------------