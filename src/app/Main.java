package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static double decimalFormatTax(double number) {
        DecimalFormat df = new DecimalFormat("0.00");
        return Double.parseDouble(df.format(number));
    }

    public static String calculateTax(double income) {
        double tax = 0;
        if ( income >= 0 && income <= 10000 ) {
            tax = income * 2.5 / 100;
        } else if ( income > 10000 && income <= 25000 ) {
            tax = income * 4.3 / 100;
        } else if ( income > 25000) {
            tax = income * 6.7 / 100;
        } else {
            System.out.println("Уведене число менше за нуль, тому податок дорівнює нулю.");
        }
        tax = decimalFormatTax(tax);
        String strTax = String.valueOf(tax);
        return strTax;
    }

    public static void main(String[] args) {
        System.out.println("Введіть, будь ласка, ціле число, щоб розрахувати податок");
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextInt();
        System.out.println("Доход: " + income);
        System.out.println("Податок: " + calculateTax(income));
    }
}