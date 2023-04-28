package com.engim.verificapratica;

public class Squadra {
    private String nome;
    private String nazione;

    public Squadra(String nome, String nazione) {
        this.nome = nome;
        this.nazione = nazione;
    }

    public String getNome() {
        return nome;
    }

    public String getNazione() {
        return nazione;
    }

}
    public Torneo() {
        squadre = new ArrayList<>();
        partite = new ArrayList<>();
    }

    public void aggiungiSquadra(Squadra s) {
        squadre.add(s);
    }

    public void sorteggiaPartite() {
        // Controllo se il numero di squadre è una potenza di 2
        int numSquadre = squadre.size();
        if ((numSquadre & (numSquadre - 1)) != 0) {
            throw new RuntimeException("Il numero di squadre deve essere una potenza di 2.");
        }

        // Sorteggio le partite
        Collections.shuffle(squadre);
        for (int i = 0; i < squadre.size(); i += 2) {
            Partita p = new Partita(squadre.get(i), squadre.get(i + 1));
            partite.add(p);
        }
    }

    public List<Partita> getPartite() {
        return partite;
    }
