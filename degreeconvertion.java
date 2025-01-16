import java.util.Scanner;

public class degreeconvertion {
    public static void main(String[] args) {
        try (Scanner degree = new Scanner(System.in)) {
            System.out.print("Enter an degree in Fahrenheit : ");
            double Fahrenheit = degree.nextDouble();
            System.out.println("Given Fahrenheit temperature:" + Fahrenheit + "F");
            double Celsius = (Fahrenheit - 32) / 1.8;
            System.out.println(Fahrenheit + "F is equals to " + Celsius + "C");
        }

    }
}
