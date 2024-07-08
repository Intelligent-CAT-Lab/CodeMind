import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		int ans = 0;

		int a = scan.nextInt();
		int n = scan.nextInt();
		int m = scan.nextInt();

		
var newVariable_0 = Math.pow(i, n);var newVariable_1 = Math.pow(i, n);		for(long i = a + a == 0? 1 : 0; newVariable_1 <= m && newVariable_1 >= 0;i++) {

var newVariable_2 = Math.pow(i, n);			long num2 = (long)newVariable_2;
			
			
			long y = Dudeney(num2);
var newVariable_3 = Math.pow(y + a,n);			long x = (int) newVariable_3;
			
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

