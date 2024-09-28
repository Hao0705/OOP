import java.util.Scanner;

public class PhepTinh {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so thu nhat: ");
		String number1 = sc.nextLine();
		
		System.out.print("Nhap so thu hai: ");
		String number2 = sc.nextLine();
		
		double x = Double.parseDouble(number1);
		double y = Double.parseDouble(number2);
		
		System.out.println(number1 + "+" + number2 + "=" + (x+y));
		System.out.println(number1 + "-" + number2 + "=" + (x-y));
		System.out.println(number1 + "x" + number2 + "=" + (x*y));
		
		if(y != 0) {
			System.out.println(number1 + "/" + number2 + "=" + (x/y));
		}else {
			System.out.println("Khong the thuc hien phep chia cho 0!");
		}
	}
}