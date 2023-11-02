//7. Write a java program to input any number and find out if it’s odd or even.

package HomeWork;

import java.util.Scanner;

public class Que07 {

    public static void main(String[] args) {
        oddEven();
        evenOdd();
    }

    public static void oddEven() {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = obj.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number you have entered (" + number + ") is " + result + " number.");
    }

    // Question 1 and Question 7 is same.
    // Using if else condition

    public static void evenOdd() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}