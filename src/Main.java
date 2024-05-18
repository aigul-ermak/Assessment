import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CeilingFun ceilingFun = new CeilingFun(0, true);

        System.out.println("Ceiling Fun Control");
        System.out.println("Press 'y' to increase speed, 'r' to reverse direction, 'e' to exit.");

        while (true) {
            System.out.println("Current Speed: " + ceilingFun.getSpeed() + ", Direction: " + (ceilingFun.isForward() ? "Forward" : "Reverse"));


            String inputUser = sc.nextLine().toLowerCase();


            if (inputUser.equals("y")) {
                ceilingFun.increaseSpeedCord();
                System.out.println("Speed increased to: " + ceilingFun.getSpeed());
            } else if (inputUser.equals("r")) {
                ceilingFun.toggleDirection();
                System.out.println("Direction changed to: " + (ceilingFun.isForward() ? "Forward" : "Reverse"));
                ceilingFun.increaseSpeedCord();
            }
            else if (inputUser.equals("e")) {
                System.out.println("Exit");
                break;
            }else {
                System.out.println("Invalid input. Please enter 'y', 'n'");
                break;
            }
        }

        sc.close();
    }
}