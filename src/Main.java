import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate today = LocalDate.now();

        // Set date like 25 December 2024
        //LocalDate today = LocalDate.of(2024, 12, 25);

        CeilingFun ceilingFun = new CeilingFun(today);

        System.out.println("Ceiling Fun Control system");
        System.out.println("Press 'y' to increase speed, 'r' to reverse direction, 'e' to exit.");

        label:
        while (true) {
            System.out.println("Current Speed: " + ceilingFun.getSpeed());
            System.out.println("Direction: " + (ceilingFun.isForward() ? "Forward" : "Reverse"));


            String inputUser = sc.nextLine().toLowerCase();

            switch (inputUser) {
                case "y":
                    ceilingFun.changeSpeedCord();
                    System.out.println("Speed increased to: " + ceilingFun.getSpeed());
                    break;
                case "r":
                    ceilingFun.toggleDirection();
                    System.out.println("Direction changed to: " + (ceilingFun.isForward() ? "Forward" : "Reverse"));
                    ceilingFun.changeSpeedCord();
                    break;
                case "e":
                    System.out.println("Exit from Ceiling Fun Control system");
                    break label;
                default:
                    System.out.println("Invalid input. Please enter 'y', 'n' or 'e'");
                    break;
            }
        }

        sc.close();
    }
}