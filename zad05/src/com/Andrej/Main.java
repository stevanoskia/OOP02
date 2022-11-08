package com.Andrej;

public class Main {

    public static void main(String[] args) {
        // Se pravi instanca na objektot so pomos na default constructor i se dodeluvaat vrednosti;
        Predmet predmet1 = new Predmet();
        predmet1.ime = "OOP";
        predmet1.profesor = "Ilija Jolevski";
        predmet1.brKrediti = 6;
        System.out.println("Ime na predmet: " + predmet1.ime
                + "; Profesor koj go predava predmetot: " + predmet1.profesor
                + "; Broj na krediti: " + predmet1.brKrediti);
        // Se koristi dinamicki konstruktor
        Predmet predmet2 = new Predmet("Polovi studii");
        System.out.println("Ime na predmet 2: " + predmet2.ime);
        // Dinamicki konstruktor
        Predmet predmet3 = new Predmet("ASP","Nikola Hristoski",6);
        System.out.println("Ime na predmetot: " + predmet3.ime
                + "; Profesor koj go predava predmetot: " + predmet3.profesor
                + "; Broj na krediti: " + predmet3.brKrediti);
    }
}
