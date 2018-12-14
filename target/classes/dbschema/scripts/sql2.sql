--liquibase formatted sql

--changeset nadalete:201808312030
--comment:Insert registers into LOG table


insert into LOG(host, description, exception, user) values('host 1', 'description 1', 'exception 1', 'user 1');
insert into LOG(host, description, exception, user) values('host 2', 'description 1', 'exception 1', 'user 1');
insert into LOG(host, description, exception, user) values('host 3', 'description 1', 'exception 1', 'user 1');
insert into LOG(host, description, exception, user) values('host 4', 'description 1', 'exception 1', 'user 1');
insert into LOG(host, description, exception, user) values('host 5', 'description 1', 'exception 1', 'user 1');
insert into LOG(host, description, exception, user) values('host 6', 'description 1', 'exception 1', 'user 1');
insert into LOG(host, description, exception, user) values('host 7', 'description 1', 'exception 1', 'user 1');
insert into LOG(host, description, exception, user) values('host 8', 'description 1', 'exception 1', 'user 1');



--rollback DELETE FROM LOG;