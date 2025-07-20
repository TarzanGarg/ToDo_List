package org.example;

import org.agenda.Agenda;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        do {
            System.out.println(agenda);
            System.out.println("Enter one of the following option to move further:");
            System.out.println("1. Create a new task.");
            System.out.println("2. Modify existing task.");
            System.out.println("3. Delete existing task.");
            System.out.println("4. Exit");
            try {
                System.out.println("please choose an option between [1-4]:");
                j = scanner.nextInt();
                scanner.nextLine();
                if (j > 4) {
                    System.out.println("Invalid input: Possible values [1, 2, 3, 4]");
                }
                switch(j){
                    case 1:
                        System.out.println("What's the tittle of the task: ");
                        String taskIn = scanner.nextLine();
                        int taskId1 = agenda.addTask(taskIn);
                        System.out.println("your input has recorded successfully");
                        System.out.println(agenda);
                        break;
                    case 2:
                        System.out.println("Please enter the TaskID, New TasK title and New Task status[True/False]: ");
                        int taskIdMod = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter new title: ");
                        String newTaskTitle = scanner.nextLine();
                        System.out.println("Enter the Task status[true/false]: ");
                        boolean taskStatus = scanner.nextBoolean();
                        scanner.nextLine();
                        boolean taskIdM = agenda.modifyTask(taskIdMod, newTaskTitle, taskStatus);
                        if (taskIdM){
                            System.out.println("Task modification is successful");
                        }
                        else{
                            System.out.println("Task Doesn't Exist");
                        }
                        System.out.println(agenda);
                        break;
                    case 3:
                        System.out.println("Please enter the taskId of task you want to Delete:  ");
                        int taskIdDel = scanner.nextInt();
                        scanner.nextLine();
                        boolean taskIdDelete = agenda.deleteTask(taskIdDel);
                        if (taskIdDelete){
                            System.out.println("Your task is deleted successfully");
                        }
                        else{
                            System.out.println("There is no such task in existence");
                        }
                        System.out.println(agenda);
                        break;
                    case 4:
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + j);
                }
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input: the input must be a valid Integer");
            }
        }
        while (j != 4);
        System.out.println("Thanks for using ToDo, See you soon......");

    }
}
