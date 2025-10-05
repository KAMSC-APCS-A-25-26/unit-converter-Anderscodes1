import java.util.Objects;
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
       boolean running=true;
       Scanner sc = new Scanner(System.in);

       while (running==true) {
           System.out.println("Convert time to total seconds\n");
           System.out.print("Enter hours: ");
           int hr = sc.nextInt();
           System.out.print("Enter minutes: ");
           int min = sc.nextInt();
           System.out.print("Enter seconds: ");
           int sec3 = sc.nextInt();

           int sec1 = hr * 3600;
           int sec2 = min * 60;
           int time = sec1 + sec2 + sec3;
           
           System.out.println("\nTime Conversion:");
           System.out.println("Input: " + hr + " hour, " + min + " minute, and " + sec3 + " second");
           System.out.println("Total seconds: " + time + " seconds\n");
           
           System.out.println("Calculation:");
           System.out.println(hr + " hours x 3600 = " + sec1 + " seconds");
           System.out.println(min + " minutes x 60 = " + sec2 + " seconds");
           System.out.println(sec3 + " seconds = " + sec3 + " seconds");
           System.out.println("Total: " + time + " seconds\n");
           
           System.out.print("Do you want to convert another time? (y/n): ");
           sc.nextLine();
           String answer = sc.nextLine();
           if (Objects.equals(answer, "n")) {
               System.out.print("Goodbye!");
               running = false;
           }
           else {
               System.out.println();
           }
       }
    }
}
