package Choo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortAndStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create the array
        double[] array = new double[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // Sort the array
        Arrays.sort(array);

        // Calculate the sum and average
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / size;

        // Output the results
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Average: %.2f%n", average);

        scanner.close();
    }
}
