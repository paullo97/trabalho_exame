create table if not exist lab04.imovel(
	imo_id int not null, 
	imo_cep varchar(10) not null, 
	imo_numero int (6),
	imo_bairro varchar(30) not null, 
	imo_cidade varchar(30) not null, 
	imo_estado varchar(20) not null, 
	pro_id int not null,
	primary key(imo_id)
	FOREIGN KEY (pro_id) REFERENCES proprietario(pro_id))