package day04;

import java.util.Scanner;

public class 지역변수_반복문에서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 반복문에서 변수 만들기 (반복문에서만 사용가능한 범위를 갖는다)
		// 반복이 수행될 때 변수가 만들어지고 다음 반복이 시작되기 전에 변수가 정리됨
		
		// 수를 입력받고 출력하기
		Scanner sc = new Scanner( System.in);
		for ( int i=1; i<=3 ; i++) {
		int su= sc.nextInt();
		System.out.println( su);
		}

	}

}
