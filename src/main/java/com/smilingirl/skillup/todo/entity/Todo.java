package com.smilingirl.skillup.todo.entity;

import com.smilingirl.skillup.todo.form.TodoForm;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

/** Todo Entity */
@Entity

public class Todo {
    public static Todo of(TodoForm todoForm){
        Todo todo = new Todo();
        todo.title = todoForm.getTitle();
        todo.deadline = todoForm.getDeadline();
        return todo;
    }
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    private String title;
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    private LocalDate deadline;
    public LocalDate getDeadline(){
        return this.deadline;
    }
    public void setDeadline(LocalDate deadline){
        this.deadline = deadline;
    }
    private boolean status;
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    @CreationTimestamp
    private LocalDateTime createTime;
    public LocalDateTime getCreateTime(){
        return this.createTime;
    }
    public void setCreateTime(LocalDateTime createTime){
        this.createTime = createTime;
    }
    @UpdateTimestamp
    private LocalDateTime updateTime;
    public LocalDateTime getUpdateTime(){
        return this.updateTime;
    }
    public void setUpdateTime(LocalDateTime updateTime1){
        this.updateTime = updateTime;
    }
}


