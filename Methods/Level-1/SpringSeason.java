public class SpringSeason {

    // Method to check if date is in Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Spring starts from March 20 (3/20) to June 20 (6/20)
        if ((month == 3 && day >= 20 && day <= 31) ||   // March 20 - March 31
            (month == 4 && day >= 1 && day <= 30)  ||   // April (whole month)
            (month == 5 && day >= 1 && day <= 31)  ||   // May (whole month)
            (month == 6 && day >= 1 && day <= 20)) {    // June 1 - June 20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        // Taking month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Checking season
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
