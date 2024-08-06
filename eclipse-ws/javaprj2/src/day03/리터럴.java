package day03;

public class 리터럴 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = 2100000000;
		// long l = 2200000000;		=> 여기서 문제가 발생한다.
		
		
		//리터럴: 프로그램에서 값 자체를 의미함
		//리터럴도 저장되고 사용딘다.
		//리터럴도 크기를 갖는다.
		
		//8라인 코드의 순서를 작성
		// 2200000000이 상수영역에 저장된다.	=>정수형리터럴은 기본이 int 이다. 여기서 발생되는 문제
		//								=>실수형리터럴은 기본형이 double이다.
		// l이라는 변수에 22억 을 저장하고 사용한다.
		
		
		//=>위의 문제 해결하려면
		long l = 2200000000L;	//long형 리터럴로 저장하고 싶다면 L이라고 붙여서 알려준다.
		
		
		System.out.println(i);
		System.out.println(l);
		
		

	}

}
