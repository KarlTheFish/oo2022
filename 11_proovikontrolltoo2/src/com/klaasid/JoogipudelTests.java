package com.klaasid;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoogipudelTests {

    @Test
    public void MassKuiJookiPole(){
        Joogipudel pudel = new Joogipudel(10, pudelityyp.KLAAS, 5, 10);
        float mass = pudel.PudeliMass();
        assertEquals(5, mass, 0.1);
    }

    @Test
    public void MassKuiJookOn(){
        Joogipudel pudel = new Joogipudel(10, pudelityyp.KLAAS, 5, 10);
        pudel.jook = new Jook("Fanta", 2, 5);
        float mass = pudel.PudeliMass();
        assertEquals(10, mass, 0.1);
    }


}
