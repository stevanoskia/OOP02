package com.Andrej;

public class Main {

    public static void main(String[] args) {
        Covek covek1 = new Covek();
        covek1.ime="Andrej";
        covek1.prezime="Stevanoski";
        covek1.maticenBroj=030400155;
        System.out.println("Imeto na covekot e: " + covek1.ime);
        System.out.println("Prezimeto na covekot e: " + covek1.prezime);
        System.out.println("Covekot ima maticen broj: " + covek1.maticenBroj);
        System.out.println("\n");
    }
}
