package day04;

public class 반복문_건너뛰기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 홀수의 합 1~10의 합
		
		// 1 2 3 4 5 6 7 8 9 10
		
		int sum =0;
		for(int i =1; i <=10; i++) {
			
			if(i%2 == 0)
				continue;
			System.out.println(i);
			sum += i;
		}

		System.out.println(sum);
	}

}
