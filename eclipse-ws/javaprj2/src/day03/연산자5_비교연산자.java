package day03;

public class 연산자5_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 비교연산자, 참, 거짓 발생
		//>, <, >=, <=, ==, !=
		
		int su1=10;
		int su2=5;
		boolean result; 	// true, false
		System.out.println( su1>su2 );
		System.out.println( su1 == su2 );
		System.out.println( su1 != su2 );
		
		
		result = su1 < su2;
		System.out.println(result);
		
		System.out.println( su1>=su2);
		System.out.println( su1<=su2);
		

	}

}
