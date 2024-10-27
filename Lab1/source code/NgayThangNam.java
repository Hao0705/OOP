package Choo;
import java.util.Scanner;

public class NgayThangNam {  
    // Kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // Lấy số ngày của tháng
    public static int getDaysInMonth(String month, int year) {
        switch (month.toLowerCase()) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 31;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return isLeapYear(year) ? 29 : 28;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 31;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 30;
            case "may":
            case "5":
                return 31;
            case "june":
            case "jun":
            case "6":
                return 30;
            case "july":
            case "jul":
            case "7":
                return 31;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 31;
            case "september":
            case "sept.":
            case "sep":
            case "9":
                return 30;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 31;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 30;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 31;
            default:
                return -1; 
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        while (true) {
            // Nhập tháng
            System.out.print("Nhap thang: ");
            monthInput = scanner.nextLine();

            // Nhập năm
            System.out.print("Nhap nam: ");
            year = scanner.nextInt();
            scanner.nextLine(); 

            // Lấy số ngày trong tháng
            int days = getDaysInMonth(monthInput, year);

            // Kiểm tra tính hợp lệ
            if (days == -1) {
                System.out.println("Thang khong hop le. Hay nhap lai.");
            } else {
                System.out.println("So ngay trong thang " + monthInput + " nam " + year + " la: " + days);
                break; 
            }
        }
        scanner.close();
    }
}
