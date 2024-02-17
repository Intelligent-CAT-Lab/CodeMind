import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int n = s.length();
		boolean eq = s.charAt(0) == s.charAt(n - 1);
		if (eq) {
			System.out.println(n % 2 == 0 ? "First" : "Second");
		} else {
			System.out.println(n % 2 == 1 ? "First" : "Second");
		}
	}
}
