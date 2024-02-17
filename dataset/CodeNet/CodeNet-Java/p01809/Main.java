import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		ArrayList<Long> yaku = new ArrayList<Long>();

		Scanner scn = new Scanner(System.in);
		long p = scn.nextLong(), q = scn.nextLong();
		scn.close();
		long qs;
		long ans = 1;
		long bp = p,bq = q,buf = p;

		while(bq % bp != 0) {
			buf = bq % bp;
			bq = bp;
			bp = buf;
		}
		qs = q/buf;
		for(long i = 2;i <= Math.sqrt(qs);i++) {
			if(qs % i ==0) {
				while(qs % i == 0) {
					qs /=i;
				}
				ans *= i;
			}
		}
		ans*= qs;
		System.out.println(ans);
	}
}
