package com.Andrej;

public class Main {

    public static void main(String[] args) {
        Avtomobil avtomobil1 = new Avtomobil();
        avtomobil1.marka = "Volkswagen";
        avtomobil1.model = "Passat";
        avtomobil1.pominatiKm = 100000;
        System.out.println("Markata na avtomobilot so default constructor e: " + avtomobil1.marka);
        System.out.println("Modelot na avtomobilot so default constructor e: " + avtomobil1.model);
        System.out.println("Pominatite kilometri na avtomobilot so default constructor e: " + avtomobil1.pominatiKm);
        System.out.println("\n");

        Avtomobil avtomobil = new Avtomobil("Audi", "A6",3000);
        System.out.println("Markata na avtomobilot so dinamicen konstruktor e: " + avtomobil.marka);
        System.out.println("Modelot na avtomobilot so dinamicen konstruktor e: " + avtomobil.model);
        System.out.println("Pominatite kilometri na avtomobilot so dinamicen konstruktor e: " + avtomobil.pominatiKm);
        System.out.println("\n");
    }
}
