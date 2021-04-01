package com.company;

import java.util.Scanner;

public class Main {


        // write your code here
        //Gearbox mcLaren = new Gearbox(6);
        /*Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        com.company.Gearbox.Gear second = new com.company.Gearbox.Gear(2, 15.4);
//        com.company.Gearbox.Gear third = new mcLaren.Gear(3, 17.8);
        System.out.println(first.driveSpeed(1000));
         */

        private static Scanner scanner = new Scanner(System.in);
        private static Button btnPrint = new Button("Print");

        public static void main (String[]args){

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
            btnPrint.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(String title) {
                    System.out.println(title + " was clicked");
                }
            });
            listen();
        }

        private static void listen () {
            boolean quit = false;
            while (!quit) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        btnPrint.onClick();

                }
            }
        }
    }

