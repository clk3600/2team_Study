package Coding_Test01;


import java.util.Scanner;

// 정수값으로 단(qustnaud : dan) 을 입력받아서, 해당당(변수명 dan)의 구구단만 화면으로 출력하는 자바 프로그램을 제작하시기 바랍니다.
public class Practice04_input_dan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2~9단 중 하나를 입력해 주세요==>");
		int dan = scan.nextInt();
		
		for(int times = 1; times <=9; times++) {
			System.out.printf("%dX%d = %2d\n", dan,times, dan*times);
		}
		
//		for (int i = 2; i <= 9; i++) {
//			
//			for (int j = 1; j <= 9; j++) {
//				int sum = i*j;
//				if(dan == i) {
//					System.out.println(i+"X"+j+"="+sum);
//				}
//			}
//			
//			
//		}
		

	}

}
