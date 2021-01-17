package com.company;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String email;
    private String companySuffix = "mre.com";

    //Constructor to recieve the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
//        System.out.println("Department: "+this.department);
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: "+this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() +"." + lastName.toLowerCase() + "@" + department+"." + companySuffix;
//        System.out.println(email);
    }


    //Ask for the department
    private String setDepartment(){
        System.out.println("New worker: "+firstName +". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1)return "sales";
        else if(depChoice == 2) return "dev";
        else if(depChoice == 2) return "acc";
        else return "";
    }

    //generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        //String pass = "";
        for(int i = 0;i<length;i++){
           int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
            //pass = pass + passwordSet.charAt(rand);
        }
        /*
         String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        int len = passwordSet.length();
        for(int i = 0;i<10;i++) {
            int rand = 0 + (int) (Math.random() * len);
            System.out.print(passwordSet.charAt(rand));
         */
        return new String(password);
        //return pass;

    }


    //set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
        System.out.println("Alternate Email Address set");
    }
    //set the mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
        System.out.println("MailBox Capacity upgraded");
    }

    //change the password
   public void changeMailPassword(String newPassword){
        this.password = newPassword;
        System.out.println("Password Updated");
    }

    public String getPassword() {
        return password;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String showInfo(){
        return "DISPLAY NAME: "+firstName+" "+lastName+"\n"+
                "COMPANY EMAIL: " +email +"\n"+
                "MAILBOX CAPACITY: " +mailboxCapacity + "mb";
    }
}
