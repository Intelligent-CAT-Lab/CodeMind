import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long p = sc.nextLong();
		if (n == 1) {
			System.out.println(p);
			return;
		}
		long res = 1;
var newVariable_0 = Math.pow(i, n);		for (int i = 2; newVariable_0 <= p; i++) {
var newVariable_1 = Math.pow(i, n);			if (p % newVariable_1 == 0) res = i;
		}
		System.out.println(res);
	}
}
