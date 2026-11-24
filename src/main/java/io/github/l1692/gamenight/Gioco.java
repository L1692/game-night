package io.github.l1692.gamenight;

public record Gioco(Integer id, String nome, int minGiocatori, int maxGiocatori, int durataMin) {

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
}
