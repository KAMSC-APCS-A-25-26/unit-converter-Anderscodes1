import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        boolean running=true;
        Scanner sc = new Scanner(System.in);
        while (running==true) {
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Which would you like to choose? ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature (in Fahrenheit): ");
                    double fah = sc.nextDouble();
                    double cel = (fah - 32) * 5/9;
                    System.out.println(fah + " degrees in Fahrenheit is equal to " + cel + " degrees in Celsius.");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter temperature (in Celsius): ");
                    cel = sc.nextDouble();
                    fah = cel * 9/5 + 32;
                    System.out.println(cel + " degrees in Celsius is equal to " + fah + " degrees in Fahrenheit.");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
            }
        }
    }
}