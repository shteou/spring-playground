mysql -u root -h 127.0.0.1 -p -e "create database users; use users; create table if not exists user ( id bigint primary key auto_increment not null , name varchar(255) not null );"
mysql -u root -h 127.0.0.1 -p -e "use users; insert into user (\`name\`) VALUES ('foo');"
mysql -u root -h 127.0.0.1 -p -e "use users; insert into user (\`name\`) VALUES ('bar');"
mysql -u root -h 127.0.0.1 -p -e "use users; insert into user (\`name\`) VALUES ('baz');"
mysql -u root -h 127.0.0.1 -p -e "use users; insert into user (\`name\`) VALUES ('quux');"

