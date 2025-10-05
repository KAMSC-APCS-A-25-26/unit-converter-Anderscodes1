import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        boolean running=true;
       Scanner sc = new Scanner(System.in);
       while (running==true) {
           System.out.println("Choose conversion direction: ");
           System.out.println("1. Convert Fahrenheit to Celsius");
           System.out.println("2. Convert Celsius to Fahrenheit");
           System.out.println("3. Exit\n");
           System.out.print("Enter your choice (1, 2, or 3): ");
           int choice = sc.nextInt();

           switch (choice) {
               case 1:
                   System.out.print("Enter temperature in Fahrenheit: ");
                   double fah = sc.nextDouble();
                   double cel = (fah - 32) * 5/9;
                   
                   System.out.println();
                   System.out.println("Conversion Results:");
                   System.out.println("Fahrenheit: " + fah);
                   System.out.println("Celsius: " + cel + "\n");
                   break;

               case 2:
                   System.out.print("Enter temperature in Celsius: ");
                   cel = sc.nextDouble();
                   fah = cel * 9/5 + 32;
                   
                   System.out.println();
                   System.out.println("Conversion Results:");
                   System.out.println("Celsius: " + cel);
                   System.out.println("Fahrenheit: " + fah + "\n");
                   break;

               case 3:
                   System.out.println("Goodbye!");
                   running = false;
                   break;
           }
       }
    }
}
