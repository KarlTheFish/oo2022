package com.company;

public class Pendel {
    double pikkus;
    Hammasratas hammasratas;

    public Pendel(double pikkus1, Hammasratas hammasratas){
        this.pikkus = pikkus1;
        this.hammasratas = hammasratas;
    }

    public double getPikkus(){
        return pikkus;
    }

    public double vonkeperiood(){
        return 2 * Math.PI * Math.sqrt(getPikkus()) / 9.8;
    }


}
