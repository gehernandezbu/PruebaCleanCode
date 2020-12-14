-- DDL -----------------------------------------------------------------------------
-- create database
create database `ger`;

-- create table state
CREATE TABLE IF NOT EXISTS `ger`.`ma_state`(
`stateId` INT NOT NULL AUTO_INCREMENT COMMENT 'Primary key of a state',
`code` VARCHAR(15) NOT NULL COMMENT 'Code that identifies the state',
`description` VARCHAR(200) NOT NULL COMMENT 'State description',
PRIMARY KEY (`stateId`)
)
COMMENT = 'system state table';

-- create table roulette
CREATE TABLE IF NOT EXISTS `ger`.`ma_roulette` (
`rouletteId` INT NOT NULL AUTO_INCREMENT COMMENT 'Primary key of a roulette',
`minNumber` INT NOT NULL COMMENT 'minimum number to bet on roulette',
`maxNumber` INT NOT NULL  COMMENT 'maximum number to bet on roulette',
`stateId` INT NOT NULL COMMENT 'reference to table ma_state',
PRIMARY KEY (`rouletteId`),
FOREIGN KEY (`stateId`) REFERENCES ma_state(`stateId`)
)
COMMENT = 'table to record the system roulette';

-- create table tr_roulette
CREATE TABLE IF NOT EXISTS `ger`.`tr_roulette` (
`trRouletteId` INT NOT NULL AUTO_INCREMENT COMMENT 'Primary key of a tr_roulette',
`numberBet` INT NOT NULL COMMENT 'number to bet on roulette',
`colorBet` VARCHAR(20) NOT NULL  COMMENT 'bet color',
`amountBet` DOUBLE NOT NULL COMMENT 'bet amount',
`amountPaid` DOUBLE NOT NULL COMMENT 'paid amount',
`usuarioId` INT NOT NULL COMMENT 'identifies the user',
`rouletteId` INT NOT NULL COMMENT 'reference to table ma_roulette',
PRIMARY KEY (`trRouletteId`),
FOREIGN KEY (`rouletteId`) REFERENCES ma_roulette(`rouletteId`)
)
COMMENT = 'transactional table of a roulette';

-- DML----------------------------------------------------------------------------
-- insert table state
insert into ger.ma_state (code, description)
values ('001', 'abierta');

insert into ger.ma_state (code, description)
values ('002', 'cerrada');



