import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CeilingFun ceilingFun = new CeilingFun(0,false);
        System.out.println("Instruction to use Ceiling Fun. Press 'e' to quit");
        while(true) {
            System.out.println("Current Speed: " + ceilingFun.getSpeed());
            String inputUser = sc.nextLine().toLowerCase();

            if(inputUser.equals("e")) {
                System.out.println("Instruction left");
                break;
            }

            System.out.println("Do you want to increase speed? Press 'y' or 'n'");

            if (inputUser.equals("y")) {
                 ceilingFun.increaseSpeedCord();
                System.out.println("Speed: " + ceilingFun.getSpeed());
            } else  if(inputUser.equals("n")){
                System.out.println("Speed isn't increase");
                break;
            } else {
                System.out.println("Invalid input. Please enter 'y', 'n', or 'e'.");
            }
        }

        sc.close();
    }
}