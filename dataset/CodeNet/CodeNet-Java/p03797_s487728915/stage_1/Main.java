import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();		long n = Long.parseLong(newVariable_0);
var newVariable_1 = sc.next();		long m = Long.parseLong(newVariable_1);
		long c = 0;
		if (n * 2 <= m) {
			c = n;
			m -= n * 2;
		}
		else {
			c = m / 2;
			m = 0;
		}
		c += m / 4;
		System.out.println(c);
	}
}