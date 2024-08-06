package day04;

public class 반복문_홀수의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 홀수의 합
		
		int sum= 0;
		
		for(int i= 0; i<= 10; i++) {
			if(i%2 != 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);

	}

}
