CREATE TABLE IF NOT EXISTS game (
  id            INT UNSIGNED      NOT NULL AUTO_INCREMENT,
  nome          VARCHAR(100)      NOT NULL,
  min_giocatori TINYINT UNSIGNED  NOT NULL,
  max_giocatori TINYINT UNSIGNED  NOT NULL,
  durata_min    SMALLINT UNSIGNED NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT uq_gioco_nome UNIQUE (nome),
  CONSTRAINT chk_gioco_giocatori CHECK (min_giocatori BETWEEN 1 AND max_giocatori),
  CONSTRAINT chk_gioco_durata CHECK (durata_min > 0)
);