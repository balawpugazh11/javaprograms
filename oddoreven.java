package MentorHints;

import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        try (Scanner oddoreven = new Scanner(System.in)) {
            System.out.println("enter a number");
            int number = oddoreven.nextInt();
            // int result = number % 2;
            if (number % 2 == 0) {
                System.out.println("the given number " + number + " is even ");
            } else {
                System.out.println("the given number " + number + " is odd ");
            }
        }
    }
}
