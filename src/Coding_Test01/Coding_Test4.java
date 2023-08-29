package Coding_Test01;

import java.util.Scanner;

// 두정수를 입력받아서 큰값을 구하는 자바프로그램 구현


public class Coding_Test4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력해 주세요 ==> ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 수를 입력해 주세요 ==> ");
		int num2 = scan.nextInt();
		if (num1 > num2) {
			System.out.println("두 수중 더 큰 수는 첫번째 입력값"+num1+"입니다.");
			
		}else {
			
			System.out.println("두 수중 더 큰 수는 두번째 입력값"+num2+"입니다.");
		}
		



	}
}







