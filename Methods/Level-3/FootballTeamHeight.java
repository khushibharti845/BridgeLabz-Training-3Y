import java.util.Random;

public class FootballTeamHeight {

    // Method to generate random heights between 150 and 250 cm
    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + rand.nextInt(101); // random number between 150 and 250 inclusive
        }
        return heights;
    }

    // Method to find the sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return sum / (double) heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.print("Heights of players: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Sum of heights: " + sum);
        System.out.printf("Mean height: %.2f cm%n", mean);
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}
