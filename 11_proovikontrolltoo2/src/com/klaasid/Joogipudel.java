package com.klaasid;

public class Joogipudel{
    float maht;
    pudelityyp pudelityyp;
    float mass;
    int taara;
    Jook jook;


    public Joogipudel(float maht, pudelityyp pudelityyp, float mass, int taara){
        this.maht = maht;
        this.pudelityyp = pudelityyp;
        this.mass = mass;
        this.taara = taara;
    }

    public float PudeliMass(){
        if(jook == null){
            return mass;
        }
        else{
            return jook.erikaal + mass;
        }
    }



}
