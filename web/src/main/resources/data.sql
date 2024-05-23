-- Eliminar datos existentes para evitar duplicados
DELETE FROM USER_AUTH;
DELETE FROM USER_DETAILS;

INSERT INTO USER_DETAILS(username, password) values ('admin', 'admin');
INSERT INTO USER_DETAILS(username, password) values ('test', 'test');

INSERT INTO USER_AUTH(username, authority) values ( 'admin', 'ROLE_ADMIN' );
INSERT INTO USER_AUTH(username, authority) values ( 'test', 'ROLE_USER' );