package day04;

import java.util.Scanner;

public class 순서도_코드구현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iTotalPrice = 0;
		int iMenuNum;
		int iMenuCnt;
		String strMenuNum;
		String strMenuCnt;
		
		final int iPrice[] = {2000, 2500, 3000, 4000};
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("메뉴: 0)2000원, 1)2500원, 2)3000원, 3)4000원");
			System.out.print("입력: ");
			
			// 입력메뉴, 수량
			while(true) {
				
				strMenuNum = sc.nextLine();
				System.out.print("수량: ");
				strMenuCnt = sc.nextLine();
				
				iMenuNum = Integer.parseInt(strMenuNum);
				iMenuCnt = Integer.parseInt(strMenuNum);
			
				// 입력완료?
			
				System.out.println("입력완료? (y/n): ");
				String result = sc.nextLine();
				if(result.equals("y")) {
					break;
				}
			}
			// 주문금액 구하기
			iTotalPrice = iPrice[iMenuNum] * iMenuCnt;
			
			// 주문완료? 
		
			System.out.println("주문완료? (y/n): ");
			String result1 = sc.nextLine();
			if(result1.equals("y")) {
				break;
			}
		}
		System.out.println(iTotalPrice);
	}
}



