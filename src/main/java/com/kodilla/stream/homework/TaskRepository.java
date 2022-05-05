package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTaskList() {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Adam", LocalDate.of(2022,05,02), LocalDate.of(2022, 05, 04)));
        tasks.add(new Task("Jan", LocalDate.of(2022,05,03), LocalDate.of(2022, 05, 07)));
        tasks.add(new Task("Julia", LocalDate.of(2022,05,03), LocalDate.of(2022, 05, 22)));
        tasks.add(new Task("Anna", LocalDate.of(2022,05,02), LocalDate.of(2022, 05, 20)));
        return tasks;



    }


}
