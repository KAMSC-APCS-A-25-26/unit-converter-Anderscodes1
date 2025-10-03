import java.util.Objects;
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        boolean running=true;
        Scanner sc = new Scanner(System.in);
        while (running==true) {
            System.out.print("Enter time (hr min sec): ");
            int hr = sc.nextInt();
            int min = sc.nextInt();
            int sec3 = sc.nextInt();

            int sec1 = hr * 3600;
            int sec2 = min * 60;

            int time = sec1 + sec2 + sec3;
            System.out.println(hr + " hour(s), " + min + " min(s), and " + sec3 + " seconds equals " + time + " seconds");
            System.out.print("Would you like to run another time (y/n)? ");
            sc.nextLine();
            String answer = sc.nextLine();
            if (Objects.equals(answer, "n")) {
                running = false;
            }
        }
    }
}