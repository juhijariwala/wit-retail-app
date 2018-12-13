USE catalog;
CREATE TABLE items (
  id          INT          NOT NULL AUTO_INCREMENT,
  name        VARCHAR(100) NOT NULL,
  description TEXT         NOT NULL,
  price       DOUBLE,
  PRIMARY KEY (id)
);

INSERT INTO items (name, description, price) VALUES ("item1", "description1", 100.0);
INSERT INTO items (name, description, price) VALUES ("item2", "description2", 200.0);