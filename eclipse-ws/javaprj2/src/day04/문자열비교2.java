package day04;

public class 문자열비교2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int su=90;
		
		if(su==90) {
			System.out.println("같다");
		}
		
		
		
		// 문자열
		String str = "i Like Java~";
		
		// 문자열 비교
		boolean result = str.equals("");
		System.out.println(result);

		result = str.equals("i ike Java~");
		System.out.println(result);
	}

}
