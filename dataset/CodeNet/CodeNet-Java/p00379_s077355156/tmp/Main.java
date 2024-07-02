import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		int ans = 0;

		int a = scan.nextInt();
System.out.println("[INST]9;a;scan.nextInt();"+a);
		int n = scan.nextInt();
System.out.println("[INST]10;n;scan.nextInt();"+n);
		int m = scan.nextInt();
System.out.println("[INST]11;m;scan.nextInt();"+m);

		
		for(long i = a + a == 0? 1 : 0; Math.pow(i, n) <= m && Math.pow(i, n) >= 0;i++) {
System.out.println("[INST]14;None;Math.pow(i, n);"+Math.pow(i, n));
System.out.println("[INST]14;None;Math.pow(i, n);"+Math.pow(i, n));

			long num2 = (long)Math.pow(i, n);
System.out.println("[INST]16;None;Math.pow(i, n);"+Math.pow(i, n));
			
			
			long y = Dudeney(num2);
			long x = (int) Math.pow(y + a,n);
System.out.println("[INST]20;None;Math.pow(y + a,n);"+Math.pow(y + a,n));
			
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

