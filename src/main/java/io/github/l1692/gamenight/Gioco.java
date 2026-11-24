package io.github.l1692.gamenight;

public record Gioco(
    int id,
    String nome,
    String descrizione,
    int numeroGiocatoriMin,
    int numeroGiocatoriMax,
    int durataMinuti
) {

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getNumeroGiocatoriMin() {
        return numeroGiocatoriMin;
    }

    public int getNumeroGiocatoriMax() {
        return numeroGiocatoriMax;
    }

    public int getDurataMinuti() {
        return durataMinuti;
    }
}
