//6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA –PFPrint in following format


package HomeWork;

import java.util.Scanner;

public class Que06 {

    public static void main(String[] args) {
        salarySlip();
    }

    public static void salarySlip() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        int eId = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter Employee Name: ");
        String eName = scan.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scan.nextDouble();

        double hra = basicSalary * 0.10;
        double da = basicSalary * 0.08;
        double ta = basicSalary * 0.09;
        double pf = basicSalary * 0.20;
        double grossSalary = basicSalary + hra + ta + da - pf;

        System.out.println("|-------------------------------------------|");
        System.out.println("|                Salary Slip                |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| Employee Id             : " + eId + "            |");
        System.out.println("| Employee Name           : " + eName + "             |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| Basic Salary            : " + basicSalary + "         |");
        System.out.println("| HRA 10%                 : " + hra + "          |");
        System.out.println("| DA 8%                   : " + da + "          |");
        System.out.println("| TA 9%                   : " + ta + "          |");
        System.out.println("| PF - 20%                : " + pf + "          |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| Gross Salary            : " + grossSalary + "         |");
        System.out.println("|===========================================|");
    }
}