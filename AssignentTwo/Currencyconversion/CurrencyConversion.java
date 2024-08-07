import java.util.Scanner;
// LUIS CHAVEZ CIS 166 1/31
/* This program calculates the converions for USD to yen, pesos and Euros
*/

public class CurrencyConversion {
    public static void main(String[] args) {

        final double EuroRate = 0.92;
        final double PesoRate = 17.19;
        final double YenRate = 146.61;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount you wish to be converted: ");
        double Dollars = scanner.nextDouble();

        double Euros = Dollars * EuroRate;
        double Yen = Dollars * YenRate;
        double Pesos = Dollars * PesoRate;

        System.out.println("Amount in Euros: " + Euros);
        System.out.println("Amount in Mexican Pesos: " + Pesos);
        System.out.println("Amount in Japanese Yen: " + Yen);

        scanner.close();
    }
}
