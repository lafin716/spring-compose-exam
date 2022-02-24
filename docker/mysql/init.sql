
CREATE DATABASE userappdb DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE user 'userapp'@'%' identified by 'userapp';

GRANT ALL privileges on userappdb.* to 'userapp'@'%';

FLUSH PRIVILEGES;

USE userappdb;

CREATE TABLE member (
    id int primary key auto_increment,
    name varchar(255)
) DEFAULT character set utf8;

INSERT INTO member (name) VALUES ('재욱');
INSERT INTO member (name) VALUES ('태미');
INSERT INTO member (name) VALUES ('찬열');
INSERT INTO member (name) VALUES ('이우');