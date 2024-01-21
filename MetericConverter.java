import java.util.Scanner;

public class MetericConverter { // Class name capitalization fixed

    public static void main(String[] args) { // Removed unnecessary "throws Exception"
        Scanner scanner = new Scanner(System.in); // Single Scanner for all input

        int choice;

        do {
            System.out.printf("Greetings! This is Haitham's Metric Converter%n==================================================%n");
            System.out.printf("1. Pounds to Kilograms%n");
            System.out.printf("2. Ounces to Grams%n");
            System.out.printf("3. Fahrenheit to Celsius%n");
            System.out.printf("4. Miles per Hour to Kilometers per Hour%n");
            System.out.print("Enter your choice (1-4), or -1 to exit: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Pounds to Kilograms
                    System.out.print("Enter weight in pounds: ");
                    double pounds = scanner.nextDouble();
                    double kilograms = pounds / 2.20462;
                    System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
                    break;
                case 2:
                    // Ounces to Grams
                    System.out.print("Enter weight in ounces: ");
                    double ounces = scanner.nextDouble();
                    double grams = ounces * 28.3495;
                    System.out.println(ounces + " ounces is " + grams + " grams.");
                    break;
                case 3:
                    // Fahrenheit to Celsius
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = (5.0 / 9) * (fahrenheit - 32);
                    System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
                    break;
                case 4:
                    // Miles per Hour to Kilometers per Hour
                    System.out.print("Enter speed in miles per hour: ");
                    double mph = scanner.nextDouble();
                    double kmh = mph * 1.609344;
                    System.out.println(mph + " mph is " + kmh + " km/h.");
                    break;
                case -1:
                    System.out.println("Thank you for using the converter! Have a nice day.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != -1);

        scanner.close(); // Close the Scanner
    }
}
