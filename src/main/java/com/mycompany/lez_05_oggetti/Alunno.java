package com.mycompany.lez_05_oggetti;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Alunno {

    private String cognome;
    private String nome;
    private int voto;
    private LocalDateTime datanascita; //per poter fare questo devo creare il metodo getDataNasc() sotto
    private String segnoZod;
    private Esame elencoEsami[];


    public String getLibretto() {
        String ris = "";
        ris = "esami fatti: \n";
        for (int i = 0; i < elencoEsami.length; i++) {
            if (elencoEsami[i] != null) {
                ris += (i + 1) + " - " + elencoEsami[i].getNomeEsame() + " " + elencoEsami[i].getVoto();
            }
            }
            return ris;
        }
    
        //aagiungi esame al libretto

        /**
         *
         * @param newEsame
         */
    public void addEsame(Esame newEsame) {
        for (int i = 0; i < elencoEsami.length; i++) {
            if (elencoEsami[i] == null) {
                elencoEsami[i] = newEsame;
                break;
            }
        }

    }

    //costruttore: si possono fare piu costruttori con stesso nome ma con diversi parametri 
    public Alunno() {
        cognome = "";
        nome = "";
        voto = 10;
        datanascita = LocalDateTime.now();
        segnoZod = "pesci";
        int anno = datanascita.getYear();
        switch (anno) {
            case 2019:
                segnoZod = "drago";
            case 2018:
                segnoZod = "cinghiale";
            case 2017:
                segnoZod = "topo";
            default:
                segnoZod = "non valido";
        }
    }

    public Esame[] getElencoEsami() {
        return elencoEsami;
    }

    public void setElencoEsami(Esame[] elencoEsami) {
        this.elencoEsami = elencoEsami;
    }

    public LocalDateTime getDataNasc() {
        return datanascita;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    public LocalDateTime getDatanascita() {
        return datanascita;
    }

    public String getSegnoZod() {
        return segnoZod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public Alunno(String cognome, String nome, int voto, LocalDateTime datanascita, String segnoZod) {
        this.cognome = cognome;
        this.nome = nome;
        this.voto = voto;
        this.datanascita = datanascita;
        this.segnoZod = segnoZod;
    }

    public Alunno(String cognome, String nome, int numeroEsami) {
        this.cognome = cognome;
        this.nome = nome;
        elencoEsami = new Esame[numeroEsami];
        this.datanascita = LocalDateTime.now();
    }

    public Alunno(String cognome) {
        String okcognome;
        if (cognome.length() > 50) {
            okcognome = cognome.substring(0, 30);
        } else {
            okcognome = cognome;
        }
        this.cognome = okcognome.toUpperCase();
        nome = "";
        voto = 10;
        datanascita = LocalDateTime.now();
        segnoZod = "";
        int anno = datanascita.getYear();
        assegnaZod(anno);

    }

    private String assegnaZod(int anno) {
        switch (anno) {
            case 2019:
                segnoZod = "drago";
            case 2018:
                segnoZod = "cinghiale";
            case 2017:
                segnoZod = "topo";
            default:
                segnoZod = "non valido";
        }

        return segnoZod;
    }

    public String getPres() {
        String frase;
        frase = "Mi chiamo " + cognome + " " + nome;
        //sistemo la data
        DateTimeFormatter miformatit = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String datOKIt = datanascita.format(miformatit);

        frase += " e sono nato il " + datOKIt;

        return frase;
    }
}
