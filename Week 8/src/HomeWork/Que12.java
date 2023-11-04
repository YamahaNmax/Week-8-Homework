//12. Write a java program to get numbers from users and print whether it is positive or negative using Switch Statement.

package HomeWork;

import java.util.Scanner;

public class Que12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int conv = Integer.compare(num, 0);

        switch (conv) {
            case 1:
                System.out.println(num + " is a positive number.");
                break;
            case -1:
                System.out.println(num + " is a negative number.");
                break;
            case 0:
                System.out.println("You entered zero.");
                break;
        }
        scan.close();
    }
}