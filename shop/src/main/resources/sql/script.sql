DROP DATABASE shop;

CREATE DATABASE shop
  CHARACTER SET utf8
  COLLATE utf8_general_ci;

USE shop;

CREATE TABLE product (
  id_product   varchar(255) NOT NULL,
  name_product varchar(50)  NOT NULL,
  description  varchar(255) NOT NULL,
  date         date         NOT NULL,
  price        int(11)      NOT NULL DEFAULT 0,
  PRIMARY KEY (id_product)
)
  ENGINE = INNODB
  AVG_ROW_LENGTH = 2340
  CHARACTER SET utf8
  COLLATE utf8_general_ci;

CREATE TABLE orders (
  id_order       bigint(20)   NOT NULL AUTO_INCREMENT,
  name_client    varchar(50)  NOT NULL,
  address_client varchar(255) NOT NULL,
  sum_order      int(11)      NOT NULL DEFAULT 0,
  date_order     datetime     NOT NULL,
  PRIMARY KEY (id_order)
)
  ENGINE = INNODB
  AUTO_INCREMENT = 1
  CHARACTER SET utf8
  COLLATE utf8_general_ci;

CREATE TABLE shop.product_detail_order (
  id_detail_order bigint(20)   NOT NULL AUTO_INCREMENT,
  quantity        int(11)      NOT NULL DEFAULT 0,
  product_id      varchar(255) NOT NULL,
  order_id        bigint(20)   NOT NULL,
  PRIMARY KEY (id_detail_order),
  CONSTRAINT FK_product_detail_order_product_id_product FOREIGN KEY (product_id)
  REFERENCES shop.product (id_product)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT FK_product_detail_order_orders_id_order FOREIGN KEY (order_id)
  REFERENCES shop.orders (id_order)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT
)
  ENGINE = INNODB
  AUTO_INCREMENT = 1
  CHARACTER SET utf8
  COLLATE utf8_general_ci;


USE shop;
INSERT INTO shop.product (id_product, name_product, description, date, price)
VALUES ('021452', 'mouse', 'a4tech', '2019-08-13', 50);
INSERT INTO shop.product (id_product, name_product, description, date, price)
VALUES ('0256', 'cookie', 'milk', '2019-09-01', 4);
INSERT INTO shop.product (id_product, name_product, description, date, price)
VALUES ('12d5s8', 'monitor', 'lg', '2019-08-23', 235);
INSERT INTO shop.product (id_product, name_product, description, date, price)
VALUES ('7hy3df', 'ssd case', 'age star', '2019-08-27', 75);

USE shop;
INSERT INTO shop.orders (id_order, name_client, address_client, sum_order, date_order)
VALUES (1, 'Denis', 'Gomel', 235, '2019-09-04 21:43:17');
INSERT INTO shop.orders (id_order, name_client, address_client, sum_order, date_order)
VALUES (2, 'Maks', 'Minsk', 1445, '2019-09-18 21:43:33');
INSERT INTO shop.orders (id_order, name_client, address_client, sum_order, date_order)
VALUES (3, 'Ann', 'Gomel', 83, '2019-09-19 21:43:45');
INSERT INTO shop.orders (id_order, name_client, address_client, sum_order, date_order)
VALUES (4, 'Valery', 'Minsk', 83, '2019-09-18 21:44:25');

USE shop;
INSERT INTO shop.product_detail_order (id_detail_order, quantity, product_id, order_id)
VALUES (1, 2, '0256', 3);
INSERT INTO shop.product_detail_order (id_detail_order, quantity, product_id, order_id)
VALUES (2, 1, '7hy3df', 3);
INSERT INTO shop.product_detail_order (id_detail_order, quantity, product_id, order_id)
VALUES (3, 5, '12d5s8', 2);
INSERT INTO shop.product_detail_order (id_detail_order, quantity, product_id, order_id)
VALUES (4, 5, '021452', 2);
INSERT INTO shop.product_detail_order (id_detail_order, quantity, product_id, order_id)
VALUES (5, 3, '0256', 2);
INSERT INTO shop.product_detail_order (id_detail_order, quantity, product_id, order_id)
VALUES (6, 1, '12d5s8', 1);
INSERT INTO shop.product_detail_order (id_detail_order, quantity, product_id, order_id)
VALUES (7, 1, '7hy3df', 4);
INSERT INTO shop.product_detail_order (id_detail_order, quantity, product_id, order_id)
VALUES (8, 2, '0256', 4);