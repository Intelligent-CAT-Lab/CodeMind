import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		
		//System.out.println(pow(m,n));
		System.out.println(pow(m,n,1000000007));
	}

	static long pow(long m, long n) {
		long res = 1L;
		while (n>0L) {
			if ((n&1L)==1L)
				res *= m;
			m *= m;
			n=n>>1;
		}
		return res;
	}
	
	static long pow(long m, long n, long mod) {
		long res = 1;
		while (n>0L) {
			if ((n&1L)==1L)
				res = (res*m)%mod;
			m = (m*m)%mod;
			n=n>>1;
		}
		return res;
	}
	
}