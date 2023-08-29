package Coding_Test01;


// for문과 if 문을 활용하여, 1부터 100까지 숫자 중에서 3의 배수값을 출력하고,
// 3의 배수 합도 출력하는 자바 프로그램을 제작하시기 바랍니다.
public class Practice_03_For_If_Multiple_Of_3 {

	public static void main(String[] args) {
		int thbh = 0;
		
		for(int i =1; i <=100 ; i++) {
//			System.out.println(i);
			
			if(i%3 == 0) {	// 3의 배수 
				System.out.println(i + "");
				thbh += i; // 3의 배수의 합값
				
			}
		}
		System.out.println("3의 배수 합계값 = "+thbh);
		
	}

}
