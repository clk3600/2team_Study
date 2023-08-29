package Coding_Test01;


import java.util.Scanner;

//수험생의 이름(변수명: name)을 , 영어점수(변수명: eng), 면접점수(변수명 : itv)를 입력 받고,ㅇ
//이때, 영어점수(변수명 : eng)가 70이상이고, 면접점수(변수명 : itv)가 70점 이상이고, 평균점수(변수명 : avg)가 80점 이상이면 합격 메시지(If)를 화면으로 출력하고,
//그렇지 않을 경우(else), 불합격 메시지를 화면으로 출력하는 자바 프로그램을 소스 코딩하시기 바랍니다. 
public class practice01_Question_If_else_Average {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력해주요==>");
		String name = scan.next();
		System.out.print("수험생 "+name+"님의 영어점수를 입력해 주세요 ==>");
		int eng = scan.nextInt();
		System.out.print("수험생 "+name+"님의 면접점수를 입력해 주세요 ==>");
		int itv = scan.nextInt(); 
		double avg = (eng+itv)/2.00;
		
		if(eng >=70 && itv >=70 && avg >=80.00 ) {
			System.out.println("수험생 "+name+"님은"+avg+"점으로 합격 하셨습니다!");
			
		}else {
			System.out.println("수험생 "+name+"님은"+avg+"점으로 불합격 하셨습니다!");
		}

	}

}
