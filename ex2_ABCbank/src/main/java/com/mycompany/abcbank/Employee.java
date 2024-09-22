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

public class Employee extends Person {

    protected long salary;

    public Employee() {
    }

    public Employee(long salary, String fullName, int age, String occupation, String iD) {
        super(fullName, age, occupation, iD);
        this.salary = salary;
    }

    public Employee(long salary) {
        this.salary = salary;
    }

    public void InputEmployee() {
        Scanner sc = new Scanner(System.in);
        super.InputPerson();
        System.out.print("Salary: ");
        salary = sc.nextLong();
    }

    public void OutputEmployee() {
        super.OutputPerson();
        System.out.print("\nSalary: " + salary);
    }
}
