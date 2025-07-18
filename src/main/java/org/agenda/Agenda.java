package org.agenda;

import java.util.ArrayList;

public class Agenda {
    private static int nextId = 1;
    private ArrayList<Task> tasks = new ArrayList<>();

    public  int addTask(String title) {
        Task t = new Task(title, nextId);
        tasks.add(t);
        nextId++;
        return t.getTaskId();
    }

    public boolean deleteTask(int taskId){
        for (Task t : tasks) {
            if (taskId ==  t.getTaskId()){
                return tasks.remove(t);
            }
        }

        return false;
    }

    public boolean modifyTask(int taskId, String title, boolean isComplete){
        for (Task t : tasks) {
            if (taskId == t.getTaskId()){
                t.setTitle(title);
                t.setComplete(isComplete);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Task t : tasks) {
            sb.append(t).append("\n");
        }
        return sb.toString();
    }
}