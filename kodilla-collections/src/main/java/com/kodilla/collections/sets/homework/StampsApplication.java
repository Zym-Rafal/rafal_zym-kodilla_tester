package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Warszawa",3,3,true));
        stamps.add(new Stamp("Kraków",4,3,false));
        stamps.add(new Stamp("Lublin",2,2,true));
        stamps.add(new Stamp("Warszawa",3,3,true));
        stamps.add(new Stamp("Koszalin",2,3,false));
        stamps.add(new Stamp("Bydgoszcz",3,3,false));
        stamps.add(new Stamp("Warszawa",3,3,true));
        stamps.add(new Stamp("Kraków",4,3,false));

        System.out.println(stamps.size());
        for(Stamp stamp : stamps) {
            System.out.println(stamp);
        }

    }
}
