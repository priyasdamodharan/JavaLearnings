package com.company;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    //If something is Static, then the value or property is not specific to an object,
    // its something that is true for all objects.
    // Static belongs to the class not for the instance of that object
    private static int id = 1001;

    //Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1-Freshmen\n2-Sophomore\n3-Junior\n4-Senior\nEnter student class level: ");
        this.gradeYear = in.nextLine();

        setstudentID();
        //System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);



    }
    //Generate an ID
    private void setstudentID(){
        id++;
        this.studentID = gradeYear + ""+ Integer.toString(id);
    }

    //Enroll in courses
    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                this.courses = courses + "\n " + course;
                tuitionBalance += costOfCourse;
            }
            else {
                break;
            }
        }while(true);

        //System.out.println("ENROLLED IN: "+ courses);
        //System.out.println("TUITION BALANCE: " +tuitionBalance);

    }

    //View balance
    public void viewBalance(){
        System.out.println("Your Balance is: $" +tuitionBalance);
    }

    //Pay Tuition
    public void payTutuion(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" +payment);
        viewBalance();
    }

    //Show Status
    public String showInfo(){
        System.out.println("---------------------------------");
        return "Name: " + firstName +" "
                +lastName+ "\nGrade Level: "+gradeYear
                +"\nStudent ID: "+studentID
                +"\nCourses Enrolled:" + courses +
                "\nBalance: $:" + tuitionBalance;

    }

}
