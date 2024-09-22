package QuanLiDanCu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author copbu
 */
import java.util.*;

public class Person {

    // Thuộc tính
    private String fullName;
    private byte age;
    private String occupation;
    private String identityCardNumber;
    private int Income;

    public int getIncome() {
        return Income;
    }

    // Khởi tạo
    public Person() {
    }

    public Person(String fullName, byte age, String occupation, String identityCardNumber) {
        this.age = age;
        this.fullName = fullName;
        this.occupation = occupation;
        this.identityCardNumber = identityCardNumber;
        this.Income = Income;
    }

    // Phương thức: 
    public void InputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fullname: ");
        fullName = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextByte();
        sc.nextLine();
        System.out.print("Occupation: ");
        occupation = sc.nextLine();
        System.out.print("Identity Card Number: ");
        identityCardNumber = sc.nextLine();
        System.out.print("Income: ");
        Income = sc.nextInt();
    }

    public void OutputPerson() {
        System.out.println("Full Name:" + fullName);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println("ID: " + identityCardNumber);
        
    }

}

