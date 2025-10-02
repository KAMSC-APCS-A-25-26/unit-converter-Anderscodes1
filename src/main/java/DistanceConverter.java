import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        boolean running=true;
        Scanner sc = new Scanner(System.in);
        while (running==true){
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.print("Which would you like to choose? ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter amount of miles: ");
                    double miles = sc.nextDouble();
                    double km = miles * 1.60935;
                    System.out.println(miles + " miles is equal to " + km + " kilometers");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter amount of kilometers: ");
                    km = sc.nextDouble();
                    miles = km / 1.60935;
                    System.out.println(km + " kilometers is equal to " + miles + " miles");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running=false;
                    break;
            }
        }
    }
}