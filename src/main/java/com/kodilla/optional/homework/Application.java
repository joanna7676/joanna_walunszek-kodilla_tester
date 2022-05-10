package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

          students.add(new Student("Adam Kowalski", new Teacher("Nowak")));
          students.add(new Student("Anna Malinowska", new Teacher("Bobrowski" )));
          students.add(new Student("Ola Kowalczyk",new Teacher("Nowak" )));
          students.add(new Student("Ela Nowak",null));
          students.add(new Student("Olga Kowalczyk",null));

          for ( Student student : students) {
              Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
              System.out.println(student.getName() + "  has teacher  " + optionalTeacher.orElse(new Teacher("<undefined>")).getName());
          }
    }
}
