package day04;

public class 등비수열_김정석 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =2;
		int r =3;
		int an =0;
		int sn =0;
		int n =0;
		
		while(n <7) {
			n = n +1;
			an = a *(int)(Math.pow(r, n-1));
			sn = sn + an;
			System.out.println(sn);
		}
		System.out.println(":::::::"+sn);
	}

}
