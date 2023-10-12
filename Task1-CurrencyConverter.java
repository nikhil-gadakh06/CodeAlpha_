import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define exchange rates
        double usdToInrRate = 73.95;
        double usdToEurRate = 0.85;
        double usdToBritishPound = 0.82;
        double usdToAustralianDollar = 1.55;
        double usdToCanadianDollar = 1.36;
        double usdToSingaporeDollar = 1.37;
        double usdToSwissFranc = 0.92;
        double usdToJapaneseYen = 149.36;

        System.out.println("Welcome to Currency Converter!");
        System.out.print("Enter the amount in USD: ");

        double amountInUSD = sc.nextDouble();

        System.out.println("Select the currency to convert to:");
        System.out.println("1. INR");
        System.out.println("2. EUR");
        System.out.println("3. British Pounds");
        System.out.println("4. Australian Dollar");
        System.out.println("5. Canadian Dollar");
        System.out.println("6. Singapore Dollar");
        System.out.println("7. Swiss France");
        System.out.println("8. Japanese Yen");

        int choice = sc.nextInt();

        double convertedAmount;

        switch (choice) {
            case 1:
                convertedAmount = amountInUSD * usdToInrRate;
                System.out.printf("%.2f USD is equal to %.2f INR%n", amountInUSD, convertedAmount);
                break;
            case 2:
                convertedAmount = amountInUSD * usdToEurRate;
                System.out.printf("%.2f USD is equal to %.2f EUR%n", amountInUSD, convertedAmount);
                break;
            case 3:
                convertedAmount = amountInUSD * usdToBritishPound;
                System.out.printf("%.2f USD is equal to %.2f BritishPounds%n", amountInUSD, convertedAmount);
                break;
            case 4:
                convertedAmount = amountInUSD * usdToAustralianDollar;
                System.out.printf("%.2f USD is equal to %.2f AustralianDollar%n", amountInUSD, convertedAmount);
                break;
            case 5:
                convertedAmount = amountInUSD * usdToCanadianDollar;
                System.out.printf("%.2f USD is equal to %.2f CanadianDollar%n", amountInUSD, convertedAmount);
                break;
            case 6:
                convertedAmount = amountInUSD * usdToSingaporeDollar;
                System.out.printf("%.2f USD is equal to %.2f SingaporeDollar%n", amountInUSD, convertedAmount);
                break;
            case 7:
                convertedAmount = amountInUSD * usdToSwissFranc;
                System.out.printf("%.2f USD is equal to %.2f SwissFrance%n", amountInUSD, convertedAmount);
                break;
            case 8:
                convertedAmount = amountInUSD * usdToJapaneseYen;
                System.out.printf("%.2f USD is equal to %.2f JapaneseYen%n", amountInUSD, convertedAmount);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }
}
