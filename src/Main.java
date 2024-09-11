import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private static final String INCREASE_SPEED = "y";
    private static final String TOGGLE_DIRECTION = "r";
    private static final String EXIT = "e";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate today = LocalDate.now();

        // Set date like 25 December 2024
        //LocalDate today = LocalDate.of(2024, 12, 25);

        CeilingFun ceilingFun = new CeilingFun(today);

        System.out.println("Ceiling Fun Control system");
        System.out.println("Press 'y' to increase speed, 'r' to reverse direction, 'e' to exit.");

        controlCeilingFan(sc, ceilingFun);

        sc.close();
    }

    private static void controlCeilingFan(Scanner sc, CeilingFun ceilingFun) {
        while (true) {

            displayFanStatus(ceilingFun);

            String inputUser = sc.nextLine().toLowerCase();

            switch (inputUser) {
                case INCREASE_SPEED:
                    ceilingFun.changeSpeedCord();
                    System.out.println("Speed increased to: " + ceilingFun.getSpeed());
                    break;
                case TOGGLE_DIRECTION:
                    ceilingFun.toggleDirection();
                    System.out.println("Direction changed to: " + (ceilingFun.isForward() ? "Forward" : "Reverse"));
                    ceilingFun.changeSpeedCord();
                    break;
                case EXIT:
                    System.out.println("Exit from Ceiling Fun Control system");
                    return;
                default:
                    System.out.println("Invalid input. Please enter 'y', 'n' or 'e'");
                    break;
            }
        }
    }

    private static void displayFanStatus(CeilingFun ceilingFun) {
        System.out.println("Current Speed: " + ceilingFun.getSpeed());
        System.out.println("Direction: " + (ceilingFun.isForward() ? "Forward" : "Reverse"));
    }
}