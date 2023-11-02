//8. Write a java program to get numbers from users and print whether it is positive or negative.

package HomeWork;

import java.util.Scanner;

public class Que08 {

    public static void main(String[] args) {
        pnNumber();
    }

    public static void pnNumber() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("You entered zero.");
        }
    }
}