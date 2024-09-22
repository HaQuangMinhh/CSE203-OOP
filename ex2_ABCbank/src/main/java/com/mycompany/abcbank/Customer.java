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
public class Customer extends Person{
    private double creditRating;

    public Customer(double creditRating, String fullName, int age, String occupation, String identityCardNumber) {
        super(fullName, age, occupation, identityCardNumber);
        this.creditRating = creditRating;
    }

    public Customer() {
    }

    public Customer(double creditRating) {
        this.creditRating = creditRating;
    }
     public void InputCustomer() {
        Scanner sc = new Scanner(System.in);
        super.InputPerson();
        System.out.print("Credit Rating: ");
        creditRating = sc.nextDouble();
    }

    public void OutputCustomer() {
        super.OutputPerson();
        System.out.print("\nCreditRating: " + creditRating);
    }
}

