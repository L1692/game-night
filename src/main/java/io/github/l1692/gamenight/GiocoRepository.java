package io.github.l1692.gamenight;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class GiocoRepository {
    private static final String SELECT = """
            SELECT id, nome, min_giocatori, max_giocatori, durata_min
            FROM gioco
            """;

    private final JdbcClient jdbc;

    public GiocoRepository(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    public List<Gioco> findAll() {
        return jdbc.sql(SELECT + "ORDER BY nome").query(Gioco.class).list();
    }

    public Optional<Gioco> findById(int id) {
        return jdbc.sql(SELECT + "WHERE id = :id").param("id", id).query(Gioco.class).optional();
    }
}