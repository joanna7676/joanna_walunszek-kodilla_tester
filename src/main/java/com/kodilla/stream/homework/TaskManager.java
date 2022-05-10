 package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        List<String> tasks = TaskRepository.getTaskList()
                .stream()
                .filter(u -> u.getDeadline().isAfter(currentDate))
                .map(TaskManager::getName)
                .collect(Collectors.toList());
                System.out.println(tasks);
            }
    public static String getName(Task task) {
        return task.getName();
    }
}
