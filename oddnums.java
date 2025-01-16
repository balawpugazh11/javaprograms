//12. WAP to Skip even numbers and print only odd numbers from 1 to 10.
package MentorHints;

public class oddnums {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
