/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abcbank;

import java.util.Scanner;

/**
 *
 * @author copbu
 */

public class Person {

    public Person(String fullName, int age, String occupation, String identityCardNumber) {
        this.fullName = fullName;
        this.age = age;
        this.occupation = occupation;
        this.identityCardNumber = identityCardNumber;
    }

    public Person() {
    }
    private String fullName;
     private int age;
     private String occupation;
     private String identityCardNumber;
    
    public void InputPerson()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Full name: ");
        fullName = sc.nextLine();
        System.err.println("Age: ");
        age = sc.nextInt();
        System.err.println("Occupation: ");
        occupation = sc.nextLine();
        System.out.println("Identity Card Number: ");
        identityCardNumber = sc.nextLine();
    }
    
    public void OutputPerson(){
        System.err.println("Full Name: "+fullName+"\nAge: "+ age + " "+ "\nOccupation: "+occupation+"\n Id card: "
        +identityCardNumber);
    }
}
