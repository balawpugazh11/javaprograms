package MentorHints;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        try (Scanner factorialnum = new Scanner(System.in)) {
            System.out.print("Enter a number :");
            int number = factorialnum.nextInt();
            if (number <= 0) {
                System.out.println("error");
            } else {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial = factorial * i;
                }
                System.out.println("the factorical of " + number + " is " + factorial);
            }
        }

    }
}
