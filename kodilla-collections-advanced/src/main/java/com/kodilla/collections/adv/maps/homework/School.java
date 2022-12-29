package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private List<Integer> numberOfStudentsInEachClasses;

    public School(String name, List<Integer> numberOfStudentsInEachClasses) {
        this.name = name;
        this.numberOfStudentsInEachClasses = numberOfStudentsInEachClasses;
    }


    public String getName() {
        return name;
    }

    public List<Integer> getNumberOfStudentsInEachClasses() {
        return numberOfStudentsInEachClasses;
    }

    public int getNumberOfAllStudentsInSchool() {
        return numberOfStudentsInEachClasses.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }


}
