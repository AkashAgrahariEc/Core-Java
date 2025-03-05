package day1.college;

import java.net.SocketOption;

public class UserInterface {
    public static void main(String[] args) {
        Student s=null;
        s = new Hosteller(101, "Akash", "Btech", "Male", "Hosteller", 45000,25,'A',"AC");
        System.out.printf("\n%-20s : %s", "Student Id", s.getStudentId());
        System.out.printf("\n%-20s : %s", "Student Name",s.getStudentName());
        System.out.printf("\n%-20s : %s", "Student Department:", s.getDepartment());
        System.out.printf("\n%-20s : %s", "Student gender:", s.getGender());
        System.out.printf("\n%-20s : %s", "Student Category:" , s.getCategory());
        System.out.printf("\n%-20s : %s", "Student CollegeFee:" , s.getCollegeFee());
        System.out.println("\n\nTotal Fee :"+s.calculateTotalFee());

        s=new DayScholar(101,"Akash","B-tech","Male","DAyScholar",60000,420,20);

        System.out.printf("\n%-20s : %s", "Student Id", s.getStudentId());
        System.out.printf("\n%-20s : %s", "Student Name",s.getStudentName());
        System.out.printf("\n%-20s : %s", "Student Department:", s.getDepartment());
        System.out.printf("\n%-20s : %s", "Student gender:", s.getGender());
        System.out.printf("\n%-20s : %s", "Student Category:" , s.getCategory());
        System.out.printf("\n%-20s : %s", "Student CollegeFee:" , s.getCollegeFee());
        System.out.println("\n\nTotal Fee :"+s.calculateTotalFee());


    }

}
