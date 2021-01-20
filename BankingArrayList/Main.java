package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
        ArrayList<Double> mydouble = new ArrayList<>();
        for(double dbl = 0.0;dbl<=10.0;dbl+=1.0){
        //autoboxing
            mydouble.add(dbl); //compiler automatically puts mydouble.add(double.valueOf(dbl));
        }
        for(int i = 0;i<mydouble.size();i++){
        //unboxing
            System.out.println(mydouble.get(i)); // compiler automatically puts mydouble.get(i).doubleValue()

        }

         */



        Bank bank = new Bank("National Australia Bank");

        if(bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }



    }
}
