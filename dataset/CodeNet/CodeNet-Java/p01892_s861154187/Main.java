import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int n = sc.nextInt();
		long min = Long.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
		    if (b % i != 0) {
		        continue;
		    }
		    long x = b / i;
		    long y = a / x;
		    if (y > n || y == 0) {
		        min = Math.min(min, Math.abs(n * x - a));
		    } else {
		        min = Math.min(min, Math.abs(y * x - a));
		    }
		    if (y + 1 > n) {
		        min = Math.min(min, Math.abs(n * x - a));
		    } else {
		        min = Math.min(min, Math.abs((y + 1) * x - a));
		    }
		    if (y - 1 == 0 || y - 1 > n) {
		        min = Math.min(min, Math.abs(n * x - a));
		    } else {
		        min = Math.min(min, Math.abs((y - 1) * x - a));
		    }
		}
		System.out.println(min);
	}
}

