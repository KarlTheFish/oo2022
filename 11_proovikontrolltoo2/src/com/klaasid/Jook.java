package com.klaasid;

public class Jook{
    String nimetus;
    float omahind;
    float erikaal;

    public Jook(String nimetus, float omahind, float erikaal){
        this.nimetus = nimetus;
        this.omahind = omahind;
        this.erikaal = erikaal;
    }

    public float Hind(float omahind, float erikaal){
        return omahind * erikaal;
    }
}
