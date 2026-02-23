package com.abhishek.backendbootcamp1;

import jakarta.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @Column(columnDefinition = "TINYINT(1)")
    private boolean completed;

    public Todo(){}

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public boolean isCompleted() { return completed; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
//    public String getTitle() {}
//    private Long id;
//    private String task;
//    private boolean completed;
//
//    // Constructors
//    public Todo(Long id, String task, boolean completed) {
//        this.id = id;
//        this.task = task;
//        this.completed = completed;
//    }
//
//    // Getters and Setters (Required for Spring to convert to/from JSON)
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//    public String getTask() { return task; }
//    public void setTask(String task) { this.task = task; }
//    public boolean isCompleted() { return completed; }
//    public void setCompleted(boolean completed) { this.completed = completed; }
//}