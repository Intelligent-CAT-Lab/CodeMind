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
var newVariable_0 = Math.abs(n * x - a);		        min = Math.min(min, newVariable_0);
		    } else {
var newVariable_1 = Math.abs(y * x - a);		        min = Math.min(min, newVariable_1);
		    }
		    if (y + 1 > n) {
var newVariable_2 = Math.abs(n * x - a);		        min = Math.min(min, newVariable_2);
		    } else {
var newVariable_3 = Math.abs((y + 1) * x - a);		        min = Math.min(min, newVariable_3);
		    }
		    if (y - 1 == 0 || y - 1 > n) {
var newVariable_4 = Math.abs(n * x - a);		        min = Math.min(min, newVariable_4);
		    } else {
var newVariable_5 = Math.abs((y - 1) * x - a);		        min = Math.min(min, newVariable_5);
		    }
		}
		System.out.println(min);
	}
}

