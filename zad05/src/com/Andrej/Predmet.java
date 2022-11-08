package com.Andrej;

public class Predmet {
    public String ime;
    public String profesor;
    public int brKrediti;
    public int semestar;

    public Predmet () {

    }
    public Predmet (String ime) {
        this.ime = ime;
    }
    public Predmet (String ime, String profesor, int brKrediti) {
        this.ime = ime;
        this.profesor = profesor;
        this.brKrediti = brKrediti;

    }
}
