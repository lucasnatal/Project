ALTER TABLE `news`.`categorias` ADD COLUMN `color` VARCHAR(45) NULL DEFAULT 'red'  AFTER `nome` ;
UPDATE `news`.`categorias` SET `color`='green' WHERE `id`='2';
UPDATE `news`.`categorias` SET `color`='orange' WHERE `id`='3';
UPDATE `news`.`categorias` SET `color`='gray' WHERE `id`='4';
