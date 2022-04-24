package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Poznan",5, true));
        stamps.add(new Stamp("Warszawa", 4, false));
        stamps.add(new Stamp("Torun", 3,true));
        stamps.add(new Stamp("Gdansk", 5, false));
        stamps.add(new Stamp("Szczecin", 3,false));
        stamps.add(new Stamp("Gdansk", 5, false));
        stamps.add(new Stamp("Torun", 3,true));
        stamps.add(new Stamp("Torun", 3,false));


        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);



    }
}
