package com.klaasid;

public class Main {
    public static void main(String[] args){
        Joogipudel pudel = new Joogipudel(2, pudelityyp.KLAAS, 3, 10);
        pudel.jook = new Jook("Fanta", 5, 4);

        System.out.println(pudel.PudeliMass());
    }
}
