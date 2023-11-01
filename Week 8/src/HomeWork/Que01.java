//1. Write a java program that tells us that Input number is odd or even?

package HomeWork;

import java.util.Scanner;

public class Que01 {

    public static void main(String[] args) {
        oddEven();
    }

    public static void oddEven() {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = obj.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number you have entered (" + number + ") is " + result + " number.");
    }
}
