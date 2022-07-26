package com.company;

public class Main {

    public static void main(String[] args) {
        int year = 2000; //


        if (   (year % 4 == 0) &&   (year % 100 != 0) ||  (year % 400 == 0) ) {
            System.out.println("kabisa yili");
        } else {
            System.out.println("kabisa yili emas");
        }


    }
}



