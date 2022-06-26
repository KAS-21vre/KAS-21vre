package com.example.cityfast;

public class zakaz {
    String Ylica;
    int cena;

    public zakaz(String ylica, int cena) {
        Ylica = ylica;
        this.cena = cena;
    }

    public String getYlica() {
        return Ylica;
    }

    public void setYlica(String ylica) {
        Ylica = ylica;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
