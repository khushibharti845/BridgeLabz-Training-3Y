import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for countdown start
        System.out.print("Enter the starting number for countdown: ");
        int counter = sc.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // After countdown finishes
        System.out.println("Liftoff! 🚀");

        sc.close();
    }
}
