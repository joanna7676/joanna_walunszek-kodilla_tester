package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    final private String title;
    final private int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;

    }

    public final String getTitle() {
        return title;
    }

    public final int getDuration() {
        return duration;
    }
}
