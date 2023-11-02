// 10. Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales

package HomeWork;

import java.util.Scanner;

public class Que10 {

    public static void main(String[] args) {
        commission();
    }

    public static void commission() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Sales ID: ");
        String salesId = scan.nextLine();

        System.out.print("Enter Seller's Name: ");
        String sellerName = scan.nextLine();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = scan.nextDouble();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scan.nextDouble();

        double commission;

        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Commission: " + commission);
    }
}