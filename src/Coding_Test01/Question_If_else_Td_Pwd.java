package Coding_Test01;


import java.util.Scanner;

//사용자의 이름(변수명 : name), 아이디(변수명 : id), 비밀번호(변수명 : pwd)를 입력 받고, 
//id가 jangnara이고, 비밀번호가 1234이면, 사용자 이름의 환영 메시지를 표현하고,
//그렇지 않을 경우, "아이디 혹은 비밀번호가 정확하지 않습니다!"라는 메시지가 나타나도록
//자바 프로그램을 코딩하시기 바랍니다.
public class Question_If_else_Td_Pwd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("사용자의 이름을 입력해 주시기 바랍니다.");
		String name = scan.next();
		System.out.print("아이디를 입력해 주세요");
		String id = scan.next();
		System.out.print("비밀번호를 입력해 주세요");
		String pwd = scan.next();
		
		if(id.equals("jangnara")&&pwd.equals("1234")) {
			System.out.println(name+"님 환영합니다!");
		}
		
		else {
		System.out.println("아이디 혹은 비밀번호가 정확하지 않습니다!");
	

		}
	}
}
