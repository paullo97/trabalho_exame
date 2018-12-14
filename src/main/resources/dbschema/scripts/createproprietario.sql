CREATE TABLE IF NOT EXISTS lab04.proprietario(
	pro_id int not null, 
	pro_cpf varchar(35) not null,
	pro_cnpj varchar(10), 
	pro_nome varchar(45) not null, 
	primary key(pro_id))