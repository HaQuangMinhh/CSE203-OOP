/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abcbank;

/**
 *
 * @author copbu
 */
 import java.util.Scanner;

public class Officer extends Employee {

    private String numberOffice;

    public Officer() {
    }

    public Officer(String numberOffice) {
        this.numberOffice = numberOffice;
    }

    public Officer(String numberOffice, long salary, String fullName, int age,
            String occupation, String iD) {
        super(salary, fullName, age, occupation, iD);
        this.numberOffice = numberOffice;
    }

    public void inputOfficer() {
        Scanner sc = new Scanner(System.in);
        super.InputEmployee();
        System.out.print("Number Office:");
        numberOffice = sc.nextLine();
    }

    public void outputOfficer() {
        super.OutputEmployee();
        System.out.print("\nNumber Office: " + numberOffice);
    }
}

