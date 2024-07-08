import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int n = s.length();
var newVariable_0 = s.charAt(0);var newVariable_1 = s.charAt(n - 1);		boolean eq = s.charAt(0) == newVariable_1;
		if (eq) {
			System.out.println(n % 2 == 0 ? "First" : "Second");
		} else {
			System.out.println(n % 2 == 1 ? "First" : "Second");
		}
	}
}
