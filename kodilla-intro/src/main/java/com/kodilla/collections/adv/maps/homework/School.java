package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private List<Integer> schools = new ArrayList<>();
    public School(int... schools) {
        for (int school : schools)
            this.schools.add(school);

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schools, school.schools);
    }
    @Override
    public int hashCode() {
        return Objects.hash(schools);
    }
    public int sum() {
        int sum = 0;
        for ( int number : schools ) {
           sum += number;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + sum() +
                '}';
    }
}

