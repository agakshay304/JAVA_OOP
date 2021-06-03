package com.akshay;

public class Song {
    private String Title;
    private double Duration;

    public Song(String title, double duration) {
        Title = title;
        Duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    @Override
    public String toString() {
        return this.Title + ": " + this.Duration;
    }
}
