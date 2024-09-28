package Choo;
import java.util.Scanner;

public class CongHaiMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrices
        System.out.print("Nhap so hang: ");
        int rows = scanner.nextInt();
        System.out.print("Nhap so cot: ");
        int columns = scanner.nextInt();

        // Declare the matrices
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sumMatrix = new int[rows][columns];

        // Input the first matrix
        System.out.println("Nhap cac phan tu cua ma tran 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input the second matrix
        System.out.println("Nhap cac phan tu cua ma tran 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Add the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Output the sum matrix
        System.out.println("Ma tran tong:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}

