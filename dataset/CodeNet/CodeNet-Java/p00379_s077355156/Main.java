import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		int ans = 0;

		int a = scan.nextInt();
		int n = scan.nextInt();
		int m = scan.nextInt();

		
		for(long i = a + a == 0? 1 : 0; Math.pow(i, n) <= m && Math.pow(i, n) >= 0;i++) {

			long num2 = (long)Math.pow(i, n);
			
			
			long y = Dudeney(num2);
			long x = (int) Math.pow(y + a,n);
			
			if(num2 == x) {
				ans++;
			}
		}
		System.out.println(ans);

		scan.close();
	}

	public static long Dudeney(long num) {
		int Ans = 0;

		while(num != 0) {
			Ans += num%10;
			num /= 10;
		}

		return Ans;
	}
}

