package com.company;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Hammasratas hammasratas = new Hammasratas(6);
	    Pendel pendel = new Pendel(6.7, hammasratas);
        boolean isLeft = false;
        while(true){
            TimeUnit.SECONDS.sleep((long) (pendel.vonkeperiood()));
            if (isLeft){
                System.out.println("Vasak");
                isLeft = false;
            }
            else {
                System.out.println("Parem");
                isLeft = true;
            }
        }
    }
}
