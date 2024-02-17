import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long count = 0;
		if (k % 2 == 0) {
			long x = n / k;
			count += (x * x * x);
			long y = (n + k / 2) / k;
			count += (y * y * y);
		} else {
			long x = n / k;
			count += (x * x * x);
		}
		System.out.println(count);
	}
}