import java.util.Scanner;

public class RandomAnalysis {

    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = 1000 + (int)(Math.random() * 9000);
        }
        return array;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / (double) numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.println("Generated numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        double[] result = findAverageMinMax(numbers);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f%n", result[0], result[1], result[2]);
    }
}
