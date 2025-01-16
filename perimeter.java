//WAP to find the perimeter of a triangle with sides measuring 10cm, 14cm and 15cm.

import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("enter three sides of an triangle");
        double length = triangle.nextDouble();
        double height = triangle.nextDouble();
        double breath = triangle.nextDouble();
        double perimeter = length + breath + height;
        System.out.println("perimeter of the triangle is " + perimeter);
    }
}
