package org.agenda;

import java.util.Date;

public class Task {
    private String title;
    private boolean isComplete;
    private final Date date;
    private final int taskId;

    public Task(String title, int taskId) {
        this.title = title;
        this.isComplete = false;
        this.date = new Date();
        this.taskId = taskId;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public int getTaskId() {
        return taskId;
    }

    @Override
    public String toString() {
        return String.format("Id: %d, Title: %s, DateCreated: %s, isComplete: %b", taskId, title, date, isComplete);
    }
}
