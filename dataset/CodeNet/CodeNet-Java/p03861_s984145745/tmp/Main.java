import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
System.out.println("[INST]6;a;Long.parseLong(sc.next());"+a);
System.out.println("[INST]6;None;sc.next();"+sc.next());
		long b = Long.parseLong(sc.next());
System.out.println("[INST]7;b;Long.parseLong(sc.next());"+b);
System.out.println("[INST]7;None;sc.next();"+sc.next());
		long x = Long.parseLong(sc.next());
System.out.println("[INST]8;x;Long.parseLong(sc.next());"+x);
System.out.println("[INST]8;None;sc.next();"+sc.next());
		sc.close();
		long count = b / x - a / x;
		System.out.println(a % x == 0 ? count + 1 : count);
	}
}