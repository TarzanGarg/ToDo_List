package org.example;

import org.agenda.Agenda;
import org.agenda.Task;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        int taskId1 = agenda.addTask("get food");
        int taskId2 = agenda.addTask("get grocery");
        ArrayList<Task> list1 = agenda.getTasks();
        System.out.println(agenda);
    }
}