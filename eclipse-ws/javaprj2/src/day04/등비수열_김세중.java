package day04;

public class 등비수열_김세중 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int commonRatio =3;
		int firstTerm =2;
		int currentTerm =firstTerm;
		int sum =2;

		for(int i =2; i <=7; i++) {
			sum +=currentTerm;
			currentTerm +=currentTerm *commonRatio;
			System.out.println(currentTerm);
		}
		
		System.out.println("::::::"+sum);
	}
	
	

}
