package Choo;
import java.util.Scanner;

public class TamGiacCan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chiều cao của tam giác
        System.out.print("Nhap chieu cao n cua tam giac can: ");
        int n = scanner.nextInt();
        
        // Vẽ tam giác cân
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
