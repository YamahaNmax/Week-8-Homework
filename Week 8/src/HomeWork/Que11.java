//11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry.

package HomeWork;

import java.util.Scanner;

public class Que11 {

    public static void main(String[] args) {
        Que11 obj = new Que11();
        obj.city();
    }

    public void city() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        char input = scan.next().charAt(0);

        if (input == 'A' || input == 'a') {
            System.out.println("City name is: Ahmedabad");
        } else if (input == 'B' || input == 'b') {
            System.out.println("City name is: Bhavnagar");
        } else if (input == 'C' || input == 'c') {
            System.out.println("City name is: Chennai");
        } else if (input == 'D' || input == 'd') {
            System.out.println("City name is: Dehradun");
        } else if (input == 'E' || input == 'e') {
            System.out.println("City name is: Elora");
        } else if (input == 'F' || input == 'f') {
            System.out.println("City name is: Fiji");
        } else {
            System.out.println("Invalid entry!");
        }
        scan.close();
    }
}