package day03;

import java.util.Scanner;

public class 김세현_문제풀이_사원임금 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		// 변수선언
		
		
		// 입력자료
		int work_time;
		int work_pay;
		
		// 출력자료
		double pay;
		
		// 처리자료
		int work_time_over;
		double work_pay_over;
		
		
		work_time = sc.nextInt();
		work_pay = sc.nextInt();
		
		if(work_time > 40) {
			work_time_over = work_time-40;
			work_pay_over = work_pay * 1.5;
			
			pay = (work_time_over * work_pay_over) + (40 * work_pay);
			
		} else {
			pay = work_time * work_pay;
		}
		
		
		//세금
		if(pay > 400000) {
			pay = pay - 30000;
		}
		
		
		//출력
		System.out.println(pay);
		
	}

}
