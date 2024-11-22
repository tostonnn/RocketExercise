package com.taskmanager.taskapi.model;

import java.time.LocalDate;

public class Task {
    private String name;
    private String description;
    private LocalDate start_date;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return start_date;
    }

    public void setDate(LocalDate start_date) {
        this.start_date = start_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Task( String name, String description, LocalDate start_date) {
        this.name = name;
        this.description = description;
        this.start_date = start_date;
    }
}
