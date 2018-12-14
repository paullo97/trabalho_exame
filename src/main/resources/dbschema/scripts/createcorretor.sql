create table if not exists lab04.corretor(
	cor_id int not null, 
	cor_nome varchar(35), 
	cor_cpf varchar(35) not null, 
	cor_cnpj varchar(35),
	cor_empresa varchar(35), 
	primary key(cor_id))