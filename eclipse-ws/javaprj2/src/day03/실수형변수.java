package day03;

public class 실수형변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//float : 	4byte		소수이하 7자리
		//double :	8byte		소수이하 15자	
		
		
		// float f = 35.4;	//소수이하 7자리	//문제발
		double d = 35.4;	//소수이하 15자
		
		
		//문제발생 이유
		//35.4  리터럴 가 상수영역에 double형 공간에 저장됨
		//float f 변수에 저될 때 문제가 발생 (큰변수 = 작은변수(ok), 작은변수 = 큰변수(x))
		
		float f = 35f;	// float형 리터럴을 만들고 싶을 때는 F를 붙힌다.
		
		
		
		System.out.println(f);
		System.out.println(d);

	}

}
