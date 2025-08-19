public class SpringSeason {
    public static void main(String[] args) {
        // Getting month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean isSpring = false;

        // Check for Spring season (March 20 – June 20)
        if ((month == 3 && day >= 20 && day <= 31) ||   // March 20 - 31
            (month == 4 && day >= 1 && day <= 30) ||    // April
            (month == 5 && day >= 1 && day <= 31) ||    // May
            (month == 6 && day >= 1 && day <= 20)) {    // June 1 - 20
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
