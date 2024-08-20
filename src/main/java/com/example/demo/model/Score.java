package com.example.demo.model;

public class Score {
    private String name;
    private int points;

    // Constructors
    public Score(String name, int points) {
        this.name = name;
        this.points = points;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
