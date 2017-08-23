package com.company;
import java.util.Scanner;//This package is where the user will be used to input

public class Main {

    public static void main(String[] args) {
        //Welcome Statement
        System.out.println("RNA to DNA");

        //Initialize the scanner object. Scanner is used in the inputs
        Scanner myScanner = new Scanner(System.in);

        //Input something
        String myName = myScanner.next();

        System.out.println("Your name is" + myName);
    }
}
