public class SpringSeason {

    // Method to check if the given month and day fall in spring season
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) { // March 20 onwards
            return true;
        } else if (month == 4 || month == 5) { // April and May
            return true;
        } else if (month == 6 && day <= 20) { // Up to June 20
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Call method to check spring season
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
