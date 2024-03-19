INSERT INTO `db_jpa`.`pessoa` (`login`, `nome`, `sobrenome`) VALUES ('cesar', 'César', 'Silva');
INSERT INTO `db_jpa`.`pessoa` (`login`, `nome`, `sobrenome`) VALUES ('ana', 'Ana', 'Rocha');
INSERT INTO `db_jpa`.`pessoa` (`login`, `nome`, `sobrenome`) VALUES ('maria', 'Maria', 'Santos');


INSERT INTO `db_jpa`.`categoria` (`nome`) VALUES ('Bebida');
INSERT INTO `db_jpa`.`categoria` (`nome`) VALUES ('Carne');
INSERT INTO `db_jpa`.`categoria` (`nome`) VALUES ('Frios');
INSERT INTO `db_jpa`.`categoria` (`nome`) VALUES ('Frutas');

INSERT INTO `db_jpa`.`produto` (`descricao`, `preco`, `quantidade`, `categoria_codigo`) VALUES ('Coca-cola', '8', '100', '1');
INSERT INTO `db_jpa`.`produto` (`descricao`, `preco`, `quantidade`, `categoria_codigo`) VALUES ('Refrigerante funada', '6', '120', '1');
INSERT INTO `db_jpa`.`produto` (`descricao`, `preco`, `quantidade`, `categoria_codigo`) VALUES ('Contra filé', '36', '100', '2');
INSERT INTO `db_jpa`.`produto` (`descricao`, `preco`, `quantidade`, `categoria_codigo`) VALUES ('Banana', '3.5', '50', '4');
INSERT INTO `db_jpa`.`produto` (`descricao`, `preco`, `quantidade`, `categoria_codigo`) VALUES ('Laranja', '2', '80', '4');
INSERT INTO `db_jpa`.`produto` (`descricao`, `preco`, `quantidade`, `categoria_codigo`) VALUES ('Mortadela', '26', '200', '3');
INSERT INTO `db_jpa`.`produto` (`descricao`, `preco`, `quantidade`, `categoria_codigo`) VALUES ('Muçarela', '35', '300', '3');
