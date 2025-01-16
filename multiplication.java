//WAP to Print Multiplication Table of a Number
package MentorHints;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        try (Scanner mutliply = new Scanner(System.in)) {
            System.out.println("enter a number");
            int number = mutliply.nextInt();
            for (int i = 0; i <= 10; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
        }

    }
}
