package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int num1, num2, reversed = 0;
		num1 = sc.nextInt();
		num2 = num1;
		
		while(num1 != 0) {
			int digit = num1 % 10;
			reversed = reversed * 10 + digit;
			num1 /= 10;
		}
		System.out.println("So " + num2 + " " + "sau khi dao nguoc la: " + reversed);
		
		System.out.println("---------------------------------");
		if (reversed == num2) {
			System.out.println(reversed + " :la mot so polinom");
		}
	}
}
