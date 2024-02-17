import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k = sc.nextLong();
		long ans = n;
		long num = n % k;
		long num2 = 0;

		while(true) {
			num2 = Math.abs(num);
			ans = Math.min(ans, num2);
			if(num < 0) {
				break;
			}
			num = num -k;
		}
		
		System.out.println(ans);

	}
}
