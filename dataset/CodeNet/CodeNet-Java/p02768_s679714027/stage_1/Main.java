


import java.util.Scanner;



public class Main {

	public static long MOD = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long aa = 1;
		long bb = 1;
		for (int i=0;i<a;i++) {
			aa=div(aa*(n-i)%MOD, i+1)%MOD;
		}
		for (int i=0;i<b;i++) {
			bb=div(bb*(n-i)%MOD, i+1)%MOD;
		}
		 System.out.println((power(2, n)-aa-bb-1+MOD*3)%MOD);



	
	}
	
	static long power (long x, long y) {
		if (y==0) {
			return 1;
		} else if (y%2==0) {
			long a = power(x, y/2);
			return a*a%MOD;
		} else {
			long a = power(x,y/2);
			return a*a%MOD*x%MOD;
		}
	}
	
	static long div (long x, long y) {
		return (x * power(y,MOD-2))%MOD;
	}
	

}



