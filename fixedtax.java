package MentorHints;

public class fixedtax {
    public static void main(String[] args) {
        double income = 310000;
        double tax_rate = 2.2;
        double tax_percent = tax_rate / 100;
        double income_tax = income * tax_percent;
        System.out.println(income_tax);
    }
}
