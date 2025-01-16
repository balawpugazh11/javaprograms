package MentorHints;

import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) {
        try (Scanner number = new Scanner(System.in)) {
            int sum = number.nextInt();
            int result = sum * (sum + 1) / 2;
            System.out.println("the sum of N numbers is " + result);
        }

    }
}
