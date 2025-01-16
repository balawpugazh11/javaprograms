package MentorHints;

public class StopAtFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) { 
                System.out.println("Encountered 5, stopping the loop.");
                break; 
            }
            System.out.println(i); 
        }
    }
}
