package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> grade = new HashMap<>();
        Principal adam = new Principal("Adam", "Kowalski");
        Principal jan = new Principal("Jan", "Nowak");
        Principal robert = new Principal("Robert", "Malinowski");

        School adamSchool = new School(20, 25, 30);
        School janSchool = new School(30, 17, 20);
        School robertSchool = new School(21, 25, 22);

        grade.put(adam, adamSchool);
        grade.put(jan, janSchool);
        grade.put(robert, robertSchool);

        System.out.println(grade.get(adam));

        for (Map.Entry<Principal, School> principalSchoolEntry : grade.entrySet()) {
            System.out.println(principalSchoolEntry.getKey() + " klasy:  " + principalSchoolEntry.getValue());
        }
    }
}
