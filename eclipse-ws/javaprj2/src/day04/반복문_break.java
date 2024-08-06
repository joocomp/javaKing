package day04;

import java.util.Scanner;

public class 반복문_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 반복문 - 탈출하기 break
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {		// 무한루프, 탈출조건을 줘야한다.
			
			// 수를 입력
			// 수를 출력
			// 수가 0이면 종료되게 함
			
			int su = sc.nextInt();
			if(su == 0)
				break;	// break는 자신이 속한 반복문을 나가게 함.
			
			System.out.println(su);
		}
		System.out.println("bye");
	}
	

}
