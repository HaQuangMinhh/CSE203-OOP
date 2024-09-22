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

public class Neighbourhood {

    private ArrayList<Household> households;
    private long totalIncome;

    public Neighbourhood() {
    }

    public Neighbourhood(ArrayList<Household> households) {
        this.households = households;
    }

    public void InputNeighbourhood() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("So ho gia dinh: ");
        n = sc.nextInt();
        households = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Household household = new Household();
            household.InputHouseHold();
            totalIncome += household.getHouseholdIncome();
            households.add(household);
        }
    }

    public void OutputNeighbourhood() {
        System.out.println("So Ho Gia Dinh Trong Khu Vuc: " + households.size());
        System.out.println("Thong tin Tung Gia Dinh: ");
        for (int i = 0; i < households.size(); i++) {
            System.out.println("Ho gia dinh thu: " + (i + 1));
            households.get(i).OutputHouseHold();
            System.out.println();
        }
        System.out.print("Total Income: " + totalIncome);
    }
}