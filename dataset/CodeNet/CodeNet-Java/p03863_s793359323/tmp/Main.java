import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
		sc.close();

		int n = s.length();
System.out.println("[INST]8;n;s.length();"+n);
		boolean eq = s.charAt(0) == s.charAt(n - 1);
System.out.println("[INST]9;None;s.charAt(0);"+s.charAt(0));
System.out.println("[INST]9;None;s.charAt(n - 1);"+s.charAt(n - 1));
		if (eq) {
			System.out.println(n % 2 == 0 ? "First" : "Second");
		} else {
			System.out.println(n % 2 == 1 ? "First" : "Second");
		}
	}
}
