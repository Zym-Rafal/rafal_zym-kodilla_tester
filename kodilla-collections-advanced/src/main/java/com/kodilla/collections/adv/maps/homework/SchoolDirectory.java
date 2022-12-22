package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> principalToSchool = new HashMap<>();
        principalToSchool.put(new Principal("Jan","Kowalski"), new School("ZS1", List.of(20,25,30,27)));
        principalToSchool.put(new Principal("Adam","Nowak"), new School("ZS2", List.of(12,22,32,17)));
        principalToSchool.put(new Principal("Kamil","Góra"), new School("ZS3", List.of(10,15,20,17)));
        principalToSchool.put(new Principal("Robert","Niedzielski"), new School("ZS4", List.of(30,24,13,19)));

        for (Map.Entry<Principal, School> entry : principalToSchool.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();
            int sum = 0;
            for (int value : school.getNumberOfStudentsInEachClasses()) {
                sum  += value;
            }

            System.out.println(principal.toString());
            System.out.println(school.getName() + " - Students: " + sum);
        }
    }


}
