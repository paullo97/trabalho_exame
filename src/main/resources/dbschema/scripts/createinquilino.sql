create table if not exists lab04.inquilino(
	inq_id int not null, 
	inq_nome varchar(35), 
	inq_cpf varchar(10) not null,
	imo_id int not null, 
	primary key(inq_id),
	foreign key(imo_id) references imovel(imo_id)
)