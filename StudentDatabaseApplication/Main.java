package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Student stu1 = new Student();
        stu1.enroll();
        stu1.payTutuion();
        System.out.println(stu1.showInfo());

        */

        System.out.println("Enter number of new Students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudent = in.nextInt();
        Student[] students = new Student[numOfStudent];
        for(int i = 0;i<numOfStudent;i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTutuion();
            System.out.println(students[i].showInfo());
        }

    }
}
