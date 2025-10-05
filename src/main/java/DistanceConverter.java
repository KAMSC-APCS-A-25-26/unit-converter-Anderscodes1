import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
       boolean running=true;
       Scanner sc = new Scanner(System.in);

       while (running==true){
           System.out.println("Choose conversion direction:");
           System.out.println("1. Convert Miles to Kilometers");
           System.out.println("2. Convert Kilometers to Miles");
           System.out.println("3. Exit\n");
           System.out.print("Enter your choice (1, 2, or 3): ");
           int choice = sc.nextInt();

           switch(choice){
               case 1:
                   System.out.print("Enter distance in miles: ");
                   double miles = sc.nextDouble();
                   double km = miles * 1.60935;
                   
                   System.out.println();
                   System.out.println("Conversion Results:");
                   System.out.println("Miles: " + miles);
                   System.out.println("Kilometers: " + km + "\n");
                   break;
                   
               case 2:
                   System.out.print("Enter distance in kilometers: ");
                   km = sc.nextDouble();
                   miles = km / 1.60935;
                   
                   System.out.println();
                   System.out.println("Conversion Results:");
                   System.out.println("Kilometers: " + km);
                   System.out.println("Miles: " + miles + "\n");
                   break;
                   
               case 3:
                   System.out.println("Goodbye!");
                   running=false;
                   break;
           }
       }
    }
}
