package com.kodilla.stream.homework;

import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double posts = UsersRepository.getUsersList()
                .stream()
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

      double average = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("Liczba postów " + average);

        average = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("Liczba postów " + average);

    }
}
