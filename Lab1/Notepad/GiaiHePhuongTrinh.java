import java.util.Scanner;

public class GiaiHePhuongTrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số cho phương trình thứ nhất
        System.out.print("Nhập a1: ");
        double a1 = scanner.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Nhập c1: ");
        double c1 = scanner.nextDouble();

        // Nhập hệ số cho phương trình thứ hai
        System.out.print("Nhập a2: ");
        double a2 = scanner.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = scanner.nextDouble();
        System.out.print("Nhập c2: ");
        double c2 = scanner.nextDouble();

        // Tính các định thức
        double D = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;

        // Xét các trường hợp
        if (D != 0) {
            // Hệ phương trình có nghiệm duy nhất
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("Hệ phương trình có nghiệm duy nhất:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            if (Dx == 0 && Dy == 0) {
                // Hệ phương trình có vô số nghiệm
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                // Hệ phương trình vô nghiệm
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        }

        // Đóng Scanner
        scanner.close();
    }
}
