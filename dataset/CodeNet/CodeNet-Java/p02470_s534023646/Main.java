import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		scan.close();
		long t = n;
		List<Long> list = new ArrayList<Long>();
		for(long i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				list.add(i);
				while(n % i == 0) {
					n = n / i;
				}
			}
		}
		if(n != 1) {
			list.add(n);
		}
		long k = 1;
		for(long i : list) {
			k *= (i - 1);
			t /= i;
		}
		System.out.println(k * t);
	}
}
