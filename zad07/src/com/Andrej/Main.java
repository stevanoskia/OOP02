package com.Andrej;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        double c;

        System.out.println("Vnesete ja stranata a:  ");
        a=s.nextInt();
        System.out.println("Vnesete ja stranata b:  ");
        b=s.nextInt();
        System.out.println("Vnesete ja stranata c:  ");
        c=s.nextDouble();

        Triagolnik triagolnik1 = new Triagolnik(a,b,c);
        System.out.println("Perimetarot na triagolnikot e: " + triagolnik1.Perimetar() + "cm");
        System.out.println("Plostinata na triagolnikot e: " + triagolnik1.Plostina() + "cm2");
    }
}
