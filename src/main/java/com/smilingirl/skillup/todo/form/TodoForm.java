package com.smilingirl.skillup.todo.form;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/** Todo Form */

public class TodoForm {
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate deadline;

    public String getTitle(){
        return this.title;
    }

    public LocalDate getDeadline(){
        return this.deadline;
    }
    public void setTitle(String name){
        this.title = title;
    }
    public void setDeadline(LocalDate deadline){
        this.deadline = deadline;
    }
}
