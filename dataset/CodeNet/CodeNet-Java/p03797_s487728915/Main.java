import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long m = Long.parseLong(sc.next());
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