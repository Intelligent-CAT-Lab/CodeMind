import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
System.out.println("[INST]4;n;Long.parseLong(sc.next());"+n);
System.out.println("[INST]4;None;sc.next();"+sc.next());
		long m = Long.parseLong(sc.next());
System.out.println("[INST]5;m;Long.parseLong(sc.next());"+m);
System.out.println("[INST]5;None;sc.next();"+sc.next());
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