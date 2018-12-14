--liquibase formatted sql

--changeset nadalete:201808311949
--comment: Creation the LOG table structure
CREATE TABLE `LOG` (
	`id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`host`	TEXT NOT NULL,
	`description`	TEXT NOT NULL,
	`exception`	TEXT NOT NULL,
	`user`	TEXT NOT NULL
);

--rollback DROP TABLE LOG;