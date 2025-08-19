import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for countdown start
        System.out.print("Enter the starting number for countdown: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // decrement counter
        }

        // After countdown finishes
        System.out.println("Liftoff! 🚀");

        sc.close();
    }
}
