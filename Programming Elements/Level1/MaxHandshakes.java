import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Formula: n * (n - 1) / 2
        int handshakes = n * (n - 1) / 2;

        // Output
        System.out.println("The maximum number of handshakes among " + n + " students is " + handshakes + ".");
        
        sc.close();
    }
}
