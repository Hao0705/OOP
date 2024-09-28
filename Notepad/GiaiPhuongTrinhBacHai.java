import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;

        // Yêu cầu nhập lại giá trị a nếu a = 0
        do {
            System.out.print("Nhap a (khác 0): ");
            a = scanner.nextDouble();
            if (a == 0) {
                System.out.println("a khac 0. Hay nhap lai.");
            }
        } while (a == 0);  // Lặp lại nếu a = 0

        // Nhập các hệ số b và c
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = b * b - 4 * a * c;

        // Xét các trường hợp nghiệm
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem.");
        }

        // Đóng Scanner
        scanner.close();
    }
}

