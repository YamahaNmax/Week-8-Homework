
package HomeWork;

import java.util.Scanner;

public class Que05 {
    public static void main(String[] args) {
        marksheet();
    }

    public static void marksheet() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scan.nextLine();

        System.out.print("Enter Roll No: ");
        String rollNo = scan.nextLine();


        double math;
        while (true) { // This will create an infinite loop until valid input is received.
            System.out.print("Enter Math Marks [Marks is between 0 to 100]: ");
            math = scan.nextDouble();

            if (math < 0 || math > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            } else {
                // Exit the loop if valid input is received
                break;
            }
        }


        double science;
        while (true) { // This will create an infinite loop until valid input is received.
            System.out.print("Enter Science Marks [Marks is between 0 to 100]: ");
            science = scan.nextDouble();

            if (science < 0 || science > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            } else {
                // Exit the loop if valid input is received
                break;
            }
        }

        double english;
        while (true) { // This will create an infinite loop until valid input is received.
            System.out.print("Enter English Marks [Marks is between 0 to 100]: ");
            english = scan.nextDouble();

            if (english < 0 || english > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            } else {
                // Exit the loop if valid input is received
                break;
            }
        }

        double total = math + science + english;
        double percentage = total / 3;
        String result = percentage >= 35 ? "Pass" : "Fail";
        String grade;

        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else {
            grade = "C";
        }


        System.out.println("-------------------------------------------------------");
        System.out.println("|                     Mark Sheet                      |");
        System.out.println("-------------------------------------------------------");
        System.out.println("| Name                      :  " + name + "                  |");
        System.out.println("| Roll No                   :  " + rollNo + "                     |");
        System.out.println("-------------------------------------------------------");
        System.out.println("| Subject                   :  Marks                  |");
        System.out.println("-------------------------------------------------------");
        System.out.println("| Math                      :  " + math + "                     |");
        System.out.println("| Science                   :  " + science + "                     |");
        System.out.println("| English                   :  " + english + "                     |");
        System.out.println("-------------------------------------------------------");
        System.out.println("| Total                     :  " + total + "                    |");
        System.out.println("-------------------------------------------------------");
        System.out.println("| Percentage                :  " + percentage + "%" + "     |");
        System.out.println("| Result                    :  " + result + "                   |");
        System.out.println("| Grade                     :  " + grade + "                     |");
        System.out.println("-------------------------------------------------------");
    }
}


