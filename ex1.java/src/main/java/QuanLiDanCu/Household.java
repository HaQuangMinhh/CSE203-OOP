package QuanLiDanCu;

import java.util.*;

public class Household {

    //Thuộc TÍnh
    private int NumberOfMember;
    private String HouseNumber;
    private ArrayList<Person> persons;
    private long householdIncome;

    public long getHouseholdIncome() {
        return householdIncome;
    }

    // Khởi tạo:
    public Household(int NumberOfMember, String HouseNumber, ArrayList<Person> persons) {
        this.NumberOfMember = NumberOfMember;
        this.HouseNumber = HouseNumber;
        this.persons = persons;
    }

    public Household() {
    }

    // Phương thức: 
    public void InputHouseHold() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số Nhà: ");
        HouseNumber = sc.nextLine();
        System.out.print("Số Thành Viên: ");
        NumberOfMember = sc.nextInt();
        //Danh Sách Hộ Gia Đình: 
        persons = new ArrayList<>();
        for (int i = 0; i < NumberOfMember; i++) {
            Person person = new Person();
            person.InputPerson();
            householdIncome += person.getIncome();
            persons.add(person);
        }
    }

    public void OutputHouseHold() {
        System.out.println("Nha so: " + HouseNumber);
        System.out.println("So thanh vien: " + NumberOfMember);
        System.out.println("Thong tin thanh vien: ");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Nguoi thu :" + (i + 1));
            persons.get(i).OutputPerson();
            System.out.println();
        }
    }

}
